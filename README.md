# xgwz
基于动态规划和数据可视化的新冠物资管理系统（后端）

# 基于数据可视化的新冠物资管理系统的设计与实现（后端实现）
---

## 项目结构说明

---

#### framework             **公共模块框架**（包括拦截器、身份验证、请求代码，公共工具类等等）

#### server                         **业务**（包括controller、entity、service、mapper、utils）

#### start		  				**启动项**（包括启动类、配置文件）

---

## 各模块依赖

**server**依赖**framework**

**start**依赖**server**和**framework**

---


## 
|名称          | 版本   | 官方文件    | 备注   | 
| -----------  | :---- | ----       | ----    | 
| Springboot   | 2.1.4 |     /       |         |
| Jwt          |       |            |         |  
| MD5          | 1.9   |            |         |    
| HuTool       | 5.5.8 |https://hutool.cn/    |      | 
| fastjson     |       |            |      | 
| mysql        |       |            |      | 
| lombok       |       |            |      | 
| MyBatis      |       |
| PageHelper   |       |



