[TOC]

# JavaEE + Oracle + Spring Boot + Mybatis + Maven 开发简易版银行管理系统

# 一、系统介绍

&emsp;&emsp;用 JavaEE + Oracle 开发的一个简易版银行信息管理系统，具备用户管理、银行卡管理、存取款管理、贷款管理、业务提醒、统计查询等功能。用到了Oracle数据库存储过程、触发器等功能。

1. 系统利用 java 开发，使用 Spring Boot 框架、MyBatis 框架简化逻辑操作；

2. 模板引擎使用 Thymeleaf；

3. 前端同时使用 BootStrap 技术，借鉴已有的后台管理网站模板开发；

4. 开发工具包括但不仅限于下面所示：

   (1) Intellij IDEA：JavaEE开发；

   (2) VMware Workstation Pro：含有 Oracle 数据库平台；

   (3) MobaXterm：SSH工具，用于连接Oracle数据库，进行对应的命令行数据操作；

   (4) Navicat Premium 12：数据库管理工具，用于远程连接Oracle数据库，可视化界面操作。

5. 系统采用Maven进行依赖包管理。

# 二、开发步骤

1. 搜索 BootStrap 模板，选择合适的模板作为开发基础模板；

2. 搭建开发平台，配置对应的连接配置参数，利用 Intellij IDEA 创建一个JavaEE项目Demo，包含Spring Boot框架、MyBatis框架、Thymeleaf模板引擎、BootStrap网站模板和Oracle数据库连接。

3. 根据要求，设计网站前端页面的内容与跳转，包含登录注册、用户管理、银行卡管理、存取款管理、贷款管理、业务提醒、统计查询和消息通知共计八个模块。

4. 根据银行管理系统的需求和八个功能模块的需求，设计数据库模型，考虑所需要设计的数据信息，设计并创建对应的表。

5. 依次按照登录注册、用户管理、银行卡管理、存取款管理、贷款管理、统计查询、业务提醒和消息通知的顺序实现对应的功能模块的后端逻辑，实现前后端的数据交互、内容展示和用户操作。各个模块的功能主要包含如下所示：

   (1) 登录注册：包好用户注册、用户登录；

   (2) 用户管理：用户信息修改、密码修改；

   (3) 银行卡管理：用户新建卡、注销卡、查看个人的所有卡信息；

   (4) 存取款管理：用户存款与取款；

   (5) 贷款管理：用户查看当前的借贷情况、借款与还款；

   (6) 统计查询：按照一定的顺序条件给用户展示所有的存款、取款、借款和还款的数据信息，同时可以提供搜索查询功能；

   (7) 业务提醒：主要是关于用户进行对应的操作是否给予对应的消息提供，包含存款提醒、取款提醒、借款提醒和还款提醒；

   (8) 消息通知：在用户订阅业务提醒的前提下，只要用户进行存款、取款、借款和还款的任一项操作均记录到数据库中并以消息的形式的展示给用户。

6. 在开发过程中还需不断进行数据库设计优化、页面改进等工作；

7. 在实现对应的与数据库交互的操作时应优先考虑是否应该是否存储过程和触发器，能够简化操作或者更加符合开发逻辑则应采用。

8. 银行管理系统的前端界面布局优化。

# 三、系统展示

1. 注册，用户可以在网站页面中输入姓名、ID和密码进行注册。

![bankManageSystem/20200418090036](https://gitee.com/summer2zz/pictures/raw/master/csdnBlog/bankManageSystem/20200418090036.png) 

2. 登录，用户进行系统首页，输入注册好的ID和密码可以登录到系统中。

![bankManageSystem/20200418090118](https://gitee.com/summer2zz/pictures/raw/master/csdnBlog/bankManageSystem/20200418090118.png) 

3. 系统首页，登录后的用户可以看到系统首页，该页面中左侧主要是用户基本信息和系统功能展示，主体内容为银行的相关资金、政策等等数据的图形化展示。

![bankManageSystem/20200418090234](https://gitee.com/summer2zz/pictures/raw/master/csdnBlog/bankManageSystem/20200418090234.png) 

4. 查看个人信息，点击左侧的【用户管理】下的【个人信息】可以看到个人的相关信息。

![bankManageSystem/20200418090401](https://gitee.com/summer2zz/pictures/raw/master/csdnBlog/bankManageSystem/20200418090401.png) 

5. 修改个人信息，点击页面中的【Edit Profile】或者【EDIT】均可以对个人信息进行对应的更新操作。

![bankManageSystem/20200418090609](https://gitee.com/summer2zz/pictures/raw/master/csdnBlog/bankManageSystem/20200418090609.png) 

6. 修改密码，用户可以根据自己的密码随时进行更改。

![bankManageSystem/20200418090723](https://gitee.com/summer2zz/pictures/raw/master/csdnBlog/bankManageSystem/20200418090723.png)

7. 银行信息，也就是进入系统的首页信息，包含银行对应的政策、资金、方案等数据的图形化展示。

![bankManageSystem/20200418090806](https://gitee.com/summer2zz/pictures/raw/master/csdnBlog/bankManageSystem/20200418090806.png) 

8. 办理银行卡，点击左侧的【银行卡管理】下的【办理银行卡】可以进入办理银行卡页面，此处为方便用户操作，只需要输入对应的银行卡号点击提交即可成功创建。

![bankManageSystem/20200418090857](https://gitee.com/summer2zz/pictures/raw/master/csdnBlog/bankManageSystem/20200418090857.png) 

9. 查看我的银行卡，点击【银行卡管理】下的【我的银行卡】可以看到用户个人的所有银行卡信息，包含卡号、创建时间和余额，同时可以对卡进行注销操作。

![bankManageSystem/20200418090953](https://gitee.com/summer2zz/pictures/raw/master/csdnBlog/bankManageSystem/20200418090953.png) 

10. 存款，点击【存取款管理】下的【存款】，用户可以看到目前自己所有卡的基本信息，之后就可以在下拉框中选择对应的卡、输入存款金额就可以进行存款处理。

![bankManageSystem/20200418091052](https://gitee.com/summer2zz/pictures/raw/master/csdnBlog/bankManageSystem/20200418091052.png) 

11. 取款，用户点击【存取款管理】下的【取款】可以进行取款操作，流程与取款基本一致。

![bankManageSystem/20200418091146](https://gitee.com/summer2zz/pictures/raw/master/csdnBlog/bankManageSystem/20200418091146.png) 

12. 查看贷款，点击【贷款管理】下的【查看贷款】可以看到用户各个卡的余额和对应的借贷记录。

![bankManageSystem/20200418091231](https://gitee.com/summer2zz/pictures/raw/master/csdnBlog/bankManageSystem/20200418091231.png)

13. 借贷款，点击【贷款管理】下的【借贷款】可以进行到借贷款页面，用户可以在该页面选择对应的银行卡和输入指定的金额进行还贷款操作。

![bankManageSystem/20200418091321](https://gitee.com/summer2zz/pictures/raw/master/csdnBlog/bankManageSystem/20200418091321.png)

14. 还贷款，点击【贷款管理】下的【还贷款】可以进行到还贷款的页面，用户可以对指定的卡进行对应的金额还贷操作，如果超出借贷金额，剩余的会直接存入对应的银行卡。

![bankManageSystem/20200418091404](https://gitee.com/summer2zz/pictures/raw/master/csdnBlog/bankManageSystem/20200418091404.png) 

15. 统计查询，点击左侧【统计查询】可以查看用户所有的存款、取款、借款、还款的记录，在对应的标题栏点击可以进行排序操作，在Search框中输入关键词还可以进行数据查找筛选。数据可以按照给定方式进行分页显示，用户可以选择每页显示数据条数。

![bankManageSystem/20200418091447](https://gitee.com/summer2zz/pictures/raw/master/csdnBlog/bankManageSystem/20200418091447.png) 

16. 业务提醒，用户点击左侧功能栏【业务提醒】可以看到目前提供的四个提醒服务——取款、存款、借款、还款，选中复选框即代表选择该提醒业务，用户在进行对应的操作会有消息提醒。

![bankManageSystem/20200418091535](https://gitee.com/summer2zz/pictures/raw/master/csdnBlog/bankManageSystem/20200418091535.png) 

17. 消息通知，用户点击左侧的消息通知可以就可以开通提醒服务后的提醒消息。该消息主要是包含操作类型（存取框、借还款）、操作卡号和金额以及时间信息。

![bankManageSystem/20200418091624](https://gitee.com/summer2zz/pictures/raw/master/csdnBlog/bankManageSystem/20200418091624.png)

# 四、开发总结

1. 通过上述数据和截图的显示可以看出来已经完成了一个简易版的银行管理系统，包含用户管理、银行卡管理、存取款管理、贷款管理、业务提醒、统计查询等功能。

2. 开发过程中还实现了触发器和存储过程的操作，由于功能比较多，在此各展示一个案例。

   (1) 触发器

   &emsp;&emsp;Oracle数据库中并不支持表的ID自增长，但是在一般操作中我们也不会去自定义ID，或者经过一系列查询对比操作然后实现自增长，这样难免过于复杂化。

   &emsp;&emsp;在此处，就可以设计一个简单触发器实现ID自增长。

   &emsp;&emsp;以用户信息信息表举例，先创建一个用户信息ID序列，然后创建一个触发器，在每次进行插入操作是自动实现ID变为下一个。

   ```sql
   -- 2.USERINFO
   create sequence userinfo_id_seq;  --创建序列
   
   create or replace trigger userinfo_id
   before insert on USERINFO  --before:执行DML等操作之前触发
   for each row  --行级触发器
   begin 
   	select userinfo_id_seq.nextval into :new.id from dual;
   end;
   /
   ```

   (2) 存储过程

   &emsp;&emsp;存储过程在系统中的应用就很广泛了，一般的增删改查理论上都是可以使用存储过程实现的。但是过于简单的我们也并没有必要使用，在一些逻辑相对复杂或者需要组合多个SQL操作才能实现的逻辑可以采用存储过程实现。

   &emsp;&emsp;此处以还款操作举例，用户在进行还款操作是需要先进行卡余额的更新，之后再进行还款记录的插入。

   &emsp;&emsp;可以先在Oracle中实现该存储过程，之后再项目中的xxxMapper.xml 文件中将原本进行的SQL语句更改为存储过程即可。

   ![bankManageSystem/20200418092035](https://gitee.com/summer2zz/pictures/raw/master/csdnBlog/bankManageSystem/20200418092035.png)

   ![bankManageSystem/20200418092058](https://gitee.com/summer2zz/pictures/raw/master/csdnBlog/bankManageSystem/20200418092058.png)

# 五、数据库相关

1. 数据库表创建语句

   ```sql
   CREATE TABLE USERINFO(
   	ID NUMBER PRIMARY KEY,
   	FIRSTNAME VARCHAR2(50),
   	LASTNAME VARCHAR2(20),
   	EMAIL VARCHAR2(50),
   	PHONE VARCHAR2(50),
   	USERNUM VARCHAR2(50),
   	POSITION VARCHAR2(50),
   	CITY VARCHAR2(50),
   	ADDRESS VARCHAR2(50),
   	DESCRIPTION VARCHAR2(255)
   );
   
   
   CREATE TABLE SIGNON(
   	ID NUMBER PRIMARY KEY,
   	USERNUM VARCHAR2(50),
   	PASSWD VARCHAR2(100)
   );
   
   CREATE TABLE CARD(
   	ID NUMBER PRIMARY KEY,
   	USER_ID NUMBER,
   	CARD_NUM VARCHAR2(50),
   	CREATE_TIME DATE,
   	BALANCE NUMBER
   );
   
   CREATE TABLE DEPOSIT(
   	ID NUMBER PRIMARY KEY,
   	CARD_ID NUMBER,
   	TIME DATE,
   	MONEY NUMBER	
   );
   
   CREATE TABLE WITHDRAW(
   	ID NUMBER PRIMARY KEY,
   	CARD_ID NUMBER,
   	TIME DATE,
   	MONEY NUMBER	
   );
   
   CREATE TABLE LOAN(
   	ID NUMBER PRIMARY KEY,
   	CARD_ID NUMBER,
   	TIME DATE,
   	MONEY NUMBER	
   );
   
   CREATE TABLE REPAYLOAN(
   	ID NUMBER PRIMARY KEY,
   	CARD_ID NUMBER,
   	TIME DATE,
   	MONEY NUMBER	
   );
   
   
   CREATE TABLE MESSAGE(
   	ID NUMBER PRIMARY KEY,
   	USERNUM VARCHAR2(50),
   	TYPE VARCHAR2(25),
   	STATUS NUMBER,
   	CONTENT VARCHAR2(255),
   	TIME DATE
   );
   
   CREATE TABLE SUBSCRIBE(
   	ID NUMBER PRIMARY KEY,
   	USERNUM VARCHAR2(50),
   	SERVICE VARCHAR2(50)
   );
   ```

2. 触发器

   ```sql
   -- 1.SIGNON
   create sequence signon_id_seq;  --创建序列
   
   create or replace trigger signon_id
   before insert on SIGNON  --before:执行DML等操作之前触发
   for each row  --行级触发器
   begin 
   	select signon_id_seq.nextval into :new.id from dual;
   end;
   /
   
   -- 2.USERINFO
   create sequence userinfo_id_seq;  --创建序列
   
   create or replace trigger userinfo_id
   before insert on USERINFO  --before:执行DML等操作之前触发
   for each row  --行级触发器
   begin 
   	select userinfo_id_seq.nextval into :new.id from dual;
   end;
   /
   
   -- 3.CARD
   create sequence card_id_seq;  --创建序列
   
   create or replace trigger card_id
   before insert on CARD  --before:执行DML等操作之前触发
   for each row  --行级触发器
   begin 
   	select card_id_seq.nextval into :new.id from dual;
   end;
   /
   
   -- 4.DEPOSIT
   create sequence deposit_id_seq;  --创建序列
   
   create or replace trigger deposit_id
   before insert on DEPOSIT  --before:执行DML等操作之前触发
   for each row  --行级触发器
   begin 
   	select deposit_id_seq.nextval into :new.id from dual;
   end;
   /
   
   -- 5.WITHDRAW
   create sequence withdraw_id_seq;  --创建序列
   
   create or replace trigger withdraw_id
   before insert on WITHDRAW  --before:执行DML等操作之前触发
   for each row  --行级触发器
   begin 
   	select withdraw_id_seq.nextval into :new.id from dual;
   end;
   /
   
   -- 6.LOAN
   create sequence loan_id_seq;  --创建序列
   
   create or replace trigger loan_id
   before insert on LOAN  --before:执行DML等操作之前触发
   for each row  --行级触发器
   begin 
   	select loan_id_seq.nextval into :new.id from dual;
   end;
   /
   
   -- 7.REPAYLOAN
   create sequence repayloan_id_seq;  --创建序列
   
   create or replace trigger repayloan_id
   before insert on REPAYLOAN  --before:执行DML等操作之前触发
   for each row  --行级触发器
   begin 
   	select repayloan_id_seq.nextval into :new.id from dual;
   end;
   /
   
   -- 8.MESSAGE
   create sequence message_id_seq;  --创建序列
   
   create or replace trigger message_id
   before insert on MESSAGE  --before:执行DML等操作之前触发
   for each row  --行级触发器
   begin 
   	select message_id_seq.nextval into :new.id from dual;
   end;
   /
   
   -- 9.SUBSCRIBE
   create sequence subscribe_id_seq;  --创建序列
   
   create or replace trigger subscribe_id
   before insert on SUBSCRIBE  --before:执行DML等操作之前触发
   for each row  --行级触发器
   begin 
   	select subscribe_id_seq.nextval into :new.id from dual;
   end;
   ```

3. 存储过程

   ```sql
   -- 1.更新用户信息
   CREATE OR REPLACE PROCEDURE updata_userinfo(
   	first_name IN VARCHAR2,
   	last_name IN VARCHAR2,
   	inputPhone IN VARCHAR2,
   	inputEmail IN VARCHAR2,
   	inputPosition IN VARCHAR2,
   	inputCity IN VARCHAR2,
   	inputAddress IN VARCHAR2,
   	inputDescription IN VARCHAR2,
   	inputUserNum IN VARCHAR2
   ) AS
   BEGIN
   	UPDATE USERINFO 
   	SET FIRSTNAME = first_name,
   			LASTNAME = last_name,
   			PHONE = inputPhone,	
   			EMAIL = inputEmail, 
   			POSITION = inputPosition, 
   			CITY = inputCity, 
   			ADDRESS = inputAddress, 
   			DESCRIPTION = inputDescription
   	WHERE USERNUM = inputUserNum;
   END;
   /
   
   -- 2.存款 存储过程
   CREATE OR REPLACE PROCEDURE deposit_money(
   	cardId IN NUMBER,
   	time IN DATE,
   	money IN NUMBER
   ) AS
   BEGIN
   	-- 记录存款过程
   	INSERT INTO DEPOSIT (CARD_ID, TIME, MONEY) 
   	VALUES (cardId, time, money);
   	
   	-- 更新卡余额
   	UPDATE CARD SET BALANCE = BALANCE + money
   	WHERE ID = cardId;
   END;
   
   -- 3.取款 存储过程
   CREATE OR REPLACE PROCEDURE withdraw_money(
   	cardId IN NUMBER,
   	time IN DATE,
   	money IN NUMBER
   ) AS
   BEGIN
   	-- 更新卡余额
   	UPDATE CARD SET BALANCE = BALANCE - money
   	WHERE ID = cardId;
   	
   	-- 记录存款过程
   	INSERT INTO WITHDRAW (CARD_ID, TIME, MONEY) 
   	VALUES (cardId, time, money);
   END;
   
   -- 4.贷款 存储过程
   CREATE OR REPLACE PROCEDURE deal_loan(
   	cardId IN NUMBER,
   	time IN DATE,
   	money IN NUMBER
   ) AS
   BEGIN
   	-- 更新卡余额
   	UPDATE CARD SET BALANCE = BALANCE - money
   	WHERE ID = cardId;
   	
   	-- 记录贷款过程
   	INSERT INTO LOAN (CARD_ID, TIME, MONEY) 
   	VALUES (cardId, time, money);
   END;
   
   -- 5.还款 存储过程
   CREATE OR REPLACE PROCEDURE repay_loan(
   	cardId IN NUMBER,
   	time IN DATE,
   	money IN NUMBER
   ) AS
   BEGIN
   	-- 更新卡余额
   	UPDATE CARD SET BALANCE = BALANCE + money
   	WHERE ID = cardId;
   	
   	-- 记录还款过程
   	INSERT INTO REPAYLOAN (CARD_ID, TIME, MONEY) 
   	VALUES (cardId, time, money);
   END;
   
   
   -- 6.添加消息 存储过程
   CREATE OR REPLACE PROCEDURE add_message(
   	userNum_ IN VARCHAR2(50),
   	type_ IN VARCHAR2(25),
   	status_ IN NUMBER,
   	content_ IN VARCHAR2(255),
   	time_ IN DATE
   ) AS
   BEGIN
   	-- 增加消息记录
   	INSERT INTO MESSAGE (USERNUM, TYPES, STATUS, CONTENT, TIME)
   	VALUES (userNum_, type_, status_, content_, time_);
   END;
   ```

---

