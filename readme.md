# MJ_Zas 说明文档

> 本项目使用springboot、security、oauth2、mybatis搭建，目标是搭建一个单点登录系统，管理各个系统用户，一个系统登录，多个系统可以访问。本系统不做具体权限判断，具体权限放在各个系统中。

## 项目目录机构
```
├── java
│   └── com
│       └── mj
│           ├── MJExamSsoApplication.java # 启动类
│           ├── config
│           │   ├── AuthorizationServerConfig.java # oauth2认证配置
│           │   ├── ResourceServerConfig.java # 资源访问配置
│           │   └── WebSecurityConfig.java # security 配置
│           ├── controller
│           │   ├── LoginController.java
│           │   ├── LoginOutController.java
│           │   └── UserController.java
│           ├── entity
│           │   └── ZAUser.java # 实体类
│           ├── handler
│           │   ├── MJAuthenctiationFailureHandler.java # 自定义登录失败，json返回
│           │   └── MJAuthenticationSuccessHandler.java # 自定义登录成功，根据访问类型判断，Ajax访问json返回，Form表单提交，页面跳转
│           ├── mapper
│           │   └── ZAUserMapper.java
│           ├── service
│           │   ├── UserService.java
│           │   └── impl
│           │       └── UserServiceImpl.java
│           └── util # 工具类
│               ├── HttpUtil.java
│               ├── JsonUtil.java
│               ├── MD5Util.java
│               ├── ResultUtil.java
│               └── UserUtil.java
├── resources
│   ├── application.yml
│   ├── bootstrap.properties
│   ├── log4j2.xml
│   ├── mybatis
│   │   ├── generatorConfig.xml
│   │   ├── mapper
│   │   │   └── ZAUserMapper.xml
│   │   └── mybatis-config.xml
│   ├── static
│   │   
│   └── templates
│       ├── index.html
│       └── login.html
```

## 后期计划
1. 功能完善
2. 界面采用Vue搭建

## 特别说明
1. 本项目还未测试，有问题联系 mj_java@163.com
2. 本项目代码copy自 https://github.com/mj1828/cjs-oauth2-example