
![alt text](https://r.51gjj.com/webpublic/images/2018727/Jue32ytr0kfa.png "51gjj Logo")

公积金－大数据开发项目
================

目录
-----------

项目源码: [gitlab.com https://t-git.51gjj.com/xuanwu/hfs.git](https://t-git.51gjj.com/xuanwu/hfs.git)（hfs）

开发说明:

   * [一、命名风格] 文件名须反映出其实现了什么类 – 包括大小写.(简洁)
   * [二、名称定义] 驼峰格式分割单词：类名（以及类别、协议名）应首字母大写;方法;变量名应该以小写字母开头;常量大写;包小写。
   * [三、代码格式] code style formatter.
   * [四、OOP规约] 当一个类有多个构造方法，或者多个同名方法，这些方法应该按顺序放置在一起;加强对静态类的管理
   * [五、集合处理].
   * [六、并发处理].       
   * [七、注释规约].
   * [七、注释规约].
   * [九、README.md] 一定要写，先写业务逻辑，再开发.
   
开发架构（hfs）:

   * hf-bins－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－shell or
   * hf-docs－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－项目文档
   * hf-libs－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－业务模块
   * hf-projects－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－项目
   * hf-shares－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－底层依赖
   * hf-share-utils－－－－－－－－－－－－－－－－－－－－－－－－－－－底层依赖util包
   
开发工具:

   * JDK1.8 click the link ＆ down the [jdk-8u192-linux-x64.rpm](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) file and install（rpm -ivh jdk-8u192-linux-x64.rpm） default dir /usr/java/.
   * IntelliJ IDEA IDEA 2018 tar down [IntelliJ IDEA IDEA 2018 for linux](https://www.jetbrains.com/idea/download/download-thanks.html?platform=linux).
   * IntelliJ IDEA IDEA 2018 exe down [IntelliJ IDEA IDEA 2018 for windows](https://www.jetbrains.com/idea/download/download-thanks.html?platform=windows).
   * IntelliJ IDEA [IntelliJ IDEA 2018 注册码](http://idea.lanyus.com/)
   * Download [Eclipse Technology](http://www.eclipse.org/downloads/)
   * Download [Apache Maven 3.6.0](http://mirrors.hust.edu.cn/apache/maven/maven-3/3.6.0/binaries/apache-maven-3.6.0-bin.tar.gz) 
   * [Gitlab](https://t-git.51gjj.com/) plz register(联系王先生).
   * Open the Haddop [webhdfs](http://xuanwu.51gjj.com:50070/dfshealth.html)，plz copy (http://xuanwu.51gjj.com:50070) .
   * Open the Hbase [webUi](http://xuanwu.51gjj.com:50070/dfshealth.html)，plz copy (http://xuanwu.51gjj.com:50070) .
   * Open the Hive [webUi](http://xuanwu.51gjj.com:50070/dfshealth.html)，plz copy (http://xuanwu.51gjj.com:50070) .   
   * Open the Azkaban [webUi](http://xuanwu.51gjj.com:50070/dfshealth.html)，plz copy (http://xuanwu.51gjj.com:50070) .   
   * Open the ketter [ketter.tar](http://xuanwu.51gjj.com:50070/dfshealth.html)，plz copy (http://xuanwu.51gjj.com:50070) .
   * Open the ketter [ketter.exe](http://xuanwu.51gjj.com:50070/dfshealth.html)，plz copy (http://xuanwu.51gjj.com:50070) .
开发环境:

   * /etc/profile.
   * /etc/hosts.
   * /etc/selinux/config
   * /etc/resolv.conf.
   * yum -y install ntp
   * ntpdate cn.pool.ntp.org
   * echo "ulimit -SHn 102400" >> /etc/rc.local
   * /etc/security/limits.conf
   * systemctl disable firewalld.service 
   * systemctl stop firewalld.service
   * /etc/sysctl.conf
   * /sbin/sysctl -p
   * /root/.vimrc

Who is using Hue
----------------
Thousands of companies and organizations use Hue to open-up and query their data in order to make smarter decisions. Just at Cloudera, Hue is heavily used by hundreds of customers executing millions of queries daily. Hue directly ships in Cloudera, Amazon, MapR, BigTop and is compatible with the other distributions.


Getting Started
---------------
Add the development packages, build and get the development server running:
```
git clone https://github.com/cloudera/hue.git
cd hue
make apps
build/env/bin/hue runserver
```
Now Hue should be running on [http://localhost:8000](http://localhost:8000) ! The configuration in development mode is ``desktop/conf/pseudo-distributed.ini``.

Read more in the [installation documentation](http://cloudera.github.io/hue/latest/admin-manual/manual.html#installation).


Docker
------
Start Hue in a single click with the [Docker Guide](https://github.com/cloudera/hue/tree/master/tools/docker) or the
[video blog post](http://gethue.com/getting-started-with-hue-in-2-minutes-with-docker/).


Community
-----------
   * User group: http://groups.google.com/a/cloudera.org/group/hue-user
   * Jira: https://issues.cloudera.org/browse/HUE
   * Reviews: https://review.cloudera.org/dashboard/?view=to-group&group=hue (repo 'hue-rw')


License
-----------
Apache License, Version 2.0
http://www.apache.org/licenses/LICENSE-2.0

yyok(开源项目）

《yyok构建微服务架构》微服务化开发平台，具有统一授权、认证后台管理系统，其中包含具备用户管理、资源权限管理、网关API管理等多个模块，支持多业务系统并行开发，可以作为后端服务的开发脚手架。代码简洁，架构清晰，适合学习和直接项目中使用。核心技术采用Spring Boot2以及Spring Cloud (Finchley.M8)相关核心组件，前端采用vue-element-admin组件。
YYOKAY 学习教程

##《YYOKAY构建微服务架构》系列 - version:linqinghong
## YYOKAY微服务实战 : Eureka + Zuul + Feign/Ribbon + Hystrix Turbine + Spring Config + sleuth + zipkin

 yyok

	欢迎大家fork me，项目中用到的技术有：
	
	springboot 快速搭建项目
	
	eureka 服务注册（发现）中心
	
	consul 服务注册（发现）中心，consul单独开consul分支，默认eureka
	
	springcloud config/Apollo 配置中心，apollo会开单独分支，目前未做
	
	ribbon rest请求客户端负载平衡器，springboot自带
	
	feign rest请求声明性REST客户端，基于ribbon
	
	Hystrix 断路器
	
	turbine 聚合多个实例Hystrix指标流
	
	zuul 路由器和过滤器
	
	Sleuth 分布式跟踪
	
	Zipkin 结合Sleuth实现链路跟踪
	
	项目启动顺序：
	
	eureka/consul -> config -> 剩下其他的服务``
	
	能看到nginx欢迎界面说明,nginx安装成功

