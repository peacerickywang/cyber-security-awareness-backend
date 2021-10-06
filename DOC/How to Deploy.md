# How to Deploy

# Prerequisite

- JAVA 1.8
- MySQL 8.0

# Linux

## 1. Copy the compiled jar and scripts to the deployment server

The deploy package is

one-deployment\Linux\CyberSecurityAwareness_Linux.tar

```bash
cd {destination path}
tar -xvf CyberSecurityAwareness_Linux.tar
```

## 2. Modify application.yml

```bash
vim application.yml
```

```yaml
server:
  port: 7001
  servlet:
    context-path: /cybersecurity

spring:
  datasource:
    username: {Your MySQL username}
    password: {Your MySQL password}
    url: jdbc:mysql://localhost:3306/cybersecurity?useUnicode=true&characterEncoding=utf-8&useSSL=true&serverTimezone=UTC
    driver-class-name: com.mysql.jdbc.Driver
  jackson:
    time-zone: GMT+8

mybatis:
  mapper-locations: classpath:mapper/*Mapper.xml
  type-aliases-package: com.example.cybersecurityawareness.model

pagehelper:
  helper-dialect: mysql
  reasonable: true
  support-methods-arguments: true
```

Save and exit.

```bash
:wq
```

## 3. Import SQL script

Get into MySQL bash

```bash
mysql -uroot -p

{input your mysql password}
```

Execute following commands

```sql
source {destination path}/cybersecurity.sql;
```

Exit from MySQL bash

```sql
exit;
```

## 3. Run the following commands

```bash
cd {destination path}
bash restart.sh
```

## 4. Check deployment

The backend programme's log is written into the file <CyberSecurityAwareness.log> 

You can use the following commands to trace the log

```bash
{destination path}
tail -200f CyberSecurityAwareness.log
```

Or, you can visit 

{server ip}:7001/cybersecurity/swagger-ui/index.html

to check the API DOC

# Windows

## 1. Copy the compiled jar and scripts to the deployment server

The deploy package is

one-deployment\Windows\CyberSecurityAwareness_Windows.zip

Unzip Awareness_Windows.zip in {destination path}

## 2. Import SQL script

Use MySQL Workbench or other third party MySQL client like Navicat to import {destination path}\cybersecurity.sql

## 3. Use Admin to run cmd.exe and run the following commands

The cmd.exe path is C:\Windows\System32

```powershell
cd {destination path}
CyberSecurityAwarenessBackend.exe install
net start CyberSecurityAwarenessBackend
```

To stop the service, try following commands

```powershell
net stop CyberSecurityAwarenessBackend
CyberSecurityAwarenessBackend.exe uninstall
```

## 4. Check deployment

Or, you can visit 

{server ip}:7001/cybersecurity/swagger-ui/index.html

to check the API DOC