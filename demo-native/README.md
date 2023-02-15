# 使用Centos
## Download Graalvm
选择Java 17  
[https://github.com/graalvm/graalvm-ce-builds/releases]

上传到文件夹 /root/ready 目录下
解压
~~~
tar -zxvf graalvm-ce-java17-linux-amd64-22.3.0.tar.gz
~~~
## Download Maven
选择apache-maven-3.8.7-bin.tar.gz  
[https://maven.apache.org/download.cgi]

上传到文件夹 /root/ready 目录下
解压
~~~
tar -zxvf apache-maven-3.8.7-bin.tar.gz 
~~~

编辑配置文件
vi /root/ready/apache-maven-3.8.7/conf/settings.xml
~~~
<localRepository>/root/ready/repository</localRepository>
~~~

## 配置环境变量
vi /etc/profile
~~~
export JAVA_HOME=/root/ready/graalvm-ce-java17-22.3.0
export PATH=$PATH:$JAVA_HOME/bin
export CLASSPATH=.:$JAVA_HOME/lib/dt.jar:$JAVA_HOME/lib/tools.jar
export JRE_HOME=$JAVA_HOME/jre
MAVEN_HOME=/root/ready/apache-maven-3.8.7
PATH=$MAVEN_HOME/bin:$PATH
export MAVEN_HOME PATH
~~~
保存配置，执行命令
~~~
source /etc/profile
~~~

## 克隆代码
进入目录 下载对应代码
~~~
cd /root/simple/code
git clone https://github.com/ok1996/ok-system-simple.git
git clone https://github.com/ok1996/simple-demo-relative.git
~~~

## 构建依赖
~~~
cd  /root/simple/code/ok-system-simple
mvn clean install
cd /root/simple/code/simple-demo-relative/demo-native/native-demo-boot
mvn clean install
~~~

## 构建native
~~~
cd /root/simple/code/simple-demo-relative/demo-native/native-demo-boot
mvn -Pnative native:compile
~~~
完成提示：
~~~
------------------------------------------------------------------------------------------------------------------------
                       27.4s (18.1% of total time) in 42 GCs | Peak RSS: 6.72GB | CPU load: 5.47
------------------------------------------------------------------------------------------------------------------------
Produced artifacts:
 /root/simple/code/simple-demo-relative/demo-native/native-demo-boot/target/native-demo-boot (executable)
 /root/simple/code/simple-demo-relative/demo-native/native-demo-boot/target/native-demo-boot.build_artifacts.txt (txt)
========================================================================================================================
Finished generating 'native-demo-boot' in 2m 30s.
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  02:36 min
[INFO] Finished at: 2023-02-15T17:05:49+08:00
[INFO] ------------------------------------------------------------------------

~~~
运行程序查看：
~~~
./target/native-demo-boot
~~~
正常运行结果展示：
~~~

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.0.2)

2023-02-15T17:06:06.533+08:00  INFO 2653 --- [           main] cn.iosd.demo.boot.NativeBootApplication        : Starting AOT-processed BootApplication using Java 17.0.5 with PID 2653 (/root/simple/code/simple-demo-relative/demo-native/native-demo-boot/target/native-demo-boot started by root in /root/simple/code/simple-demo-relative/demo-native/native-demo-boot)
2023-02-15T17:06:06.533+08:00  INFO 2653 --- [           main] cn.iosd.demo.boot.NativeBootApplication        : No active profile set, falling back to 1 default profile: "default"
2023-02-15T17:06:06.545+08:00  INFO 2653 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 11010 (http)
2023-02-15T17:06:06.545+08:00  INFO 2653 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2023-02-15T17:06:06.545+08:00  INFO 2653 --- [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.5]
2023-02-15T17:06:06.549+08:00  INFO 2653 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2023-02-15T17:06:06.549+08:00  INFO 2653 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 16 ms
2023-02-15T17:06:06.605+08:00  INFO 2653 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 11010 (http) with context path ''
2023-02-15T17:06:06.606+08:00  INFO 2653 --- [           main] cn.iosd.demo.boot.NativeBootApplication        : Started BootApplication in 0.08 seconds (process running for 0.09)
~~~


## 异常提示
报错
~~~
Default native-compiler executable 'gcc' not found via environment variable PATH
~~~
执行安装
~~~
yum install gcc zlib zlib-devel -y
~~~

# 使用Windows10
## Download Graalvm
选择Java 17  
[https://github.com/graalvm/graalvm-ce-builds/releases]

## Download Maven
...

## 配置环境变量
...

## 克隆代码
进入目录 下载对应代码
~~~
cd E:\Code\Study\
E:
git clone https://github.com/ok1996/ok-system-simple.git
git clone https://github.com/ok1996/simple-demo-relative.git
~~~

## 构建依赖
~~~
cd  E:\Code\Study\ok-system-simple
mvn clean install
cd E:\Code\Study\simple-demo-relative\demo-native\native-demo-boot
mvn clean install
~~~

## 构建native
~~~
cd E:\Code\Study\simple-demo-relative\demo-native\native-demo-boot
mvn -Pnative native:compile
~~~
完成提示:
~~~
------------------------------------------------------------------------------------------------------------------------
                        5.0s (3.9% of total time) in 41 GCs | Peak RSS: 6.42GB | CPU load: 6.94
------------------------------------------------------------------------------------------------------------------------
Produced artifacts:
 E:\Code\Study\simple-demo-relative\demo-native\native-demo-boot\target\native-demo-boot.build_artifacts.txt (txt)
 E:\Code\Study\simple-demo-relative\demo-native\native-demo-boot\target\native-demo-boot.exe (executable)
========================================================================================================================
Finished generating 'native-demo-boot' in 2m 9s.
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  02:20 min
[INFO] Finished at: 2023-01-05T14:09:23+08:00
[INFO] ------------------------------------------------------------------------
~~~
运行程序查看：
~~~
cd target
native-demo-boot.exe
~~~
正常运行结果展示：
~~~

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.0.1)

2023-01-05T12:56:43.253+08:00  INFO 20724 --- [           main] cn.iosd.demo.boot.NativeBootApplication        : Starting AOT-processed BootApplication using Java 17.0.5 with PID 20724 (E:\Code\Study\simple-demo-relative\demo-native\native-demo-boot\target\simple-native-demo.exe started by suntek in E:\Code\Study\simple-demo-relative\demo-native\native-demo-boot\target)
2023-01-05T12:56:43.253+08:00  INFO 20724 --- [           main] cn.iosd.demo.boot.NativeBootApplication        : No active profile set, falling back to 1 default profile: "default"
2023-01-05T12:56:43.337+08:00  INFO 20724 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 11010 (http)
2023-01-05T12:56:43.338+08:00  INFO 20724 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2023-01-05T12:56:43.338+08:00  INFO 20724 --- [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.4]
2023-01-05T12:56:43.385+08:00  INFO 20724 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2023-01-05T12:56:43.385+08:00  INFO 20724 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 132 ms
2023-01-05T12:56:43.458+08:00  INFO 20724 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 11010 (http) with context path ''
2023-01-05T12:56:43.459+08:00  INFO 20724 --- [           main] cn.iosd.demo.boot.NativeBootApplication        : Started BootApplication in 0.225 seconds (process running for 0.231)
~~~
## 异常提示
报错 cl.exe 不存在
~~~
Error: Default native-compiler executable 'cl.exe' not found via environment variable PATH
Error: To prevent native-toolchain checking provide command-line option -H:-CheckToolchain
~~~
安装 Microsoft Visual Studio 2019   
[https://learn.microsoft.com/zh-cn/visualstudio/releases/2019/release-notes]

单个组件 勾选
~~~
MSVC v141-VS 2017 C++ ARM Spectre 缓解库(v14.16)
MSVC v141-VS 2017 C++ ARM 生成工具(v14.16)
MSVC v141-VS 2017 C++ ARM64 Spectre 缓解库(v14.16)
MSVC v141-VS 2017 C++ ARM64 生成工具(v14.16)
MSVC v141-VS 2017 C++ x64/x86 Spectre 缓解库(v14.16)
MSVC v141-VS 2017 C++ x64/x86生成工具(v14.16)
~~~
工作负载 勾选
~~~
使用c++的桌面开发
~~~
安装目录例：  
D:\Program Files (x86)\Microsoft Visual Studio\2019\Professional

配置系统环境变量PATH  
D:\Program Files (x86)\Microsoft Visual Studio\2019\Professional\VC\Tools\MSVC\14.16.27023\bin\HostX64\x64

终端执行
~~~
call "D:\Program Files (x86)\Microsoft Visual Studio\2019\Professional\VC\Auxiliary\Build\vcvars64.bat"
~~~

# 使用Idea
参考官网Using Graalvm in Intellij IDEA  
[https://www.graalvm.org/latest/guides/]