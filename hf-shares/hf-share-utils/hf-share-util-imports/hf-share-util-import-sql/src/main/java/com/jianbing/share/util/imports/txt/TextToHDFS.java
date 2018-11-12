package com.jianbing.share.util.imports.txt;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.text.SimpleDateFormat;
import java.util.Date;

import static java.nio.file.StandardWatchEventKinds.*;

public class TextToHDFS {
	private WatchService watcher;

	public TextToHDFS(Path path) throws IOException {
		watcher = FileSystems.getDefault().newWatchService();
		path.register(watcher, ENTRY_CREATE, ENTRY_DELETE, ENTRY_MODIFY);
	}

	public void handleEvents() throws InterruptedException {
		while (true) {
			WatchKey key = watcher.take();
			for (WatchEvent event : key.pollEvents()) {
				WatchEvent.Kind kind = event.kind();
				if (kind == OVERFLOW) {
					continue;
				}
				WatchEvent e = (WatchEvent) event;
				Path context = (Path) e.context();
				String fileName = context.toString();
				String message = "";
				if (kind.name() == "ENTRY_CREATE") {
					message = fileName + "--->create,By";
				} else if (kind.name() == "ENTRY_DELETE") {
					message = fileName + "---> delete,By";
				} else if (kind.name() == "ENTRY_MODIFY") {
					message = fileName + "---> modify,By";
				}
				if (fileName.endsWith("swp") || fileName.endsWith("swpx")) {
					continue;
				} else {
					System.out.println(message + "   " +new SimpleDateFormat("yyyy-MM-dd E a HH:mm:ss").format(new Date()));
				}
			}
			if (!key.reset()) {
				break;
			}
		}
	}

	public static void main(String args[]) throws IOException, InterruptedException {
		String watchDir = "/tmp";
		System.out.println("Begin watching DIR: /tmp ");
		new TextToHDFS(Paths.get(watchDir)).handleEvents();
	}
}
