1、将skywalking-agent.zip 上传到应用部署的服务器上解压（放到任意目录都可以，只要你的应用对该目录有读写权限即可），如果应用会部署到多台服务器，那在各台服务器都上传该目录信息即可。

然后需要将目录agent.config中的YOU_APPLICATION_NAME 改成您的项目名称，也可以用系统参数-Dskywalking.agent.service_name 重写。

 agent.config中的collector.backend_service是skywalking服务器地址，可以通过系统参数-Dskywalking.collector.backend_service重写。

其他配置项可根据项目的需求进行调整。


2、在各种环境启动方式如下，-javaagent: 后面的值是上一步你解压得到的 skywalking-agent.jar在服务器的绝对路径

项目启动的时候如果没有找到skywalking-agent.jar则会提示，找到了的话会打印类似于日志如下所示，并且在skywalking-agent的logs目录下生成日志文件

AgentPackagePath : The beacon class location is jar:file:/F:/Skywalking/skywalking-agent/skywalking-agent.jar!/org/apache/skywalking/apm/agent/core/boot/AgentPackagePath.class.
 Config file found in F:\Skywalking\skywalking-agent\config\agent.config.

 
 JAR file
在启动你的应用程序的命令行中添加 -javaagent 参数. 并确保在-jar参数之前添加它. 例如:
java -javaagent:F:\Skywalking\skywalking-agent\skywalking-agent.jar -jar F:\workspace\SkywalkingTest\target\skywalking-0.0.1-SNAPSHOT.jar


项目成功后就可以在监控页面中查看项目信息（  http://192.168.80.235:8080 用户名 defangchain密码 defangchain）



