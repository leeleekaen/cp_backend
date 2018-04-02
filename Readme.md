### 框架介绍 
- 本系统采用Springboot + Spring MVC + JPA进行搭建。
- 使用mysql作为数据库，druid为数据库连接池。
- application.yml为项目主要配置文件，通过其中的active设置生效的具体配置文件（application-dev.yml）。
- logback-dev.xml为日志记录配置文件。
- pom.xml为maven的配置文件，用于管理各种依赖包。

### 背景介绍
- 本系统是彩票后台系统，主要为彩票APP及后台管理界面提供数据及接口支持。
- 系统采用前后台分离开发，前端项目链接尚未搭建完毕，后续将提供链接。
- 系统正处于初步开发阶段，功能尚待开发。

### 代码结构
- 采用MVC分层结构，包括controller、service、dao、entity以及工具层util。
- controller:控制层，接收前端请求，使用了restful接口规范。
- service:业务逻辑层，主要用于数据处理以及逻辑处理。由于代码业务不是很复杂，省略了service接口层。
- dao:数据库连接层，用于操作数据库。
- entity:实体层，提供数据模板，用于数据收集管理。
- util:工具类，所需要的工具类集合。

### 其他
- CpBackendApplication.java:为程序入口。由于SpringBoot采用java的方式运行，其项目启动只需要运行main方法即可。spring自带web容器。
- GlobalExceptionHandle.java:全局异常处理类。统一处理抛出的异常。