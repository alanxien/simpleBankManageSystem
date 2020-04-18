/*
 Navicat Premium Data Transfer

 Source Server         : oracle_summer
 Source Server Type    : Oracle
 Source Server Version : 110200
 Source Host           : 192.168.164.**:1521
 Source Schema         : SUMMER

 Target Server Type    : Oracle
 Target Server Version : 110200
 File Encoding         : 65001

 Date: 31/12/2019 17:12:22
*/


-- ----------------------------
-- Table structure for CARD
-- ----------------------------
DROP TABLE "SUMMER"."CARD";
CREATE TABLE "SUMMER"."CARD" (
  "ID" NUMBER NOT NULL ,
  "USER_ID" NUMBER ,
  "CARD_NUM" VARCHAR2(50 BYTE) ,
  "CREATE_TIME" DATE ,
  "BALANCE" NUMBER 
)
TABLESPACE "USERS"
LOGGING
NOCOMPRESS
PCTFREE 10
INITRANS 1
STORAGE (
  INITIAL 65536 
  NEXT 1048576 
  MINEXTENTS 1
  MAXEXTENTS 2147483645
  BUFFER_POOL DEFAULT
)
PARALLEL 1
NOCACHE
DISABLE ROW MOVEMENT
;

-- ----------------------------
-- Records of CARD
-- ----------------------------
INSERT INTO "SUMMER"."CARD" VALUES ('21', '22', '123456', TO_DATE('2019-12-28 22:29:37', 'SYYYY-MM-DD HH24:MI:SS'), '0');
INSERT INTO "SUMMER"."CARD" VALUES ('28', '1', '36954', TO_DATE('2019-12-30 21:44:33', 'SYYYY-MM-DD HH24:MI:SS'), '-73');
INSERT INTO "SUMMER"."CARD" VALUES ('22', '1', '1234567', TO_DATE('2019-12-30 18:22:50', 'SYYYY-MM-DD HH24:MI:SS'), '1079');

-- ----------------------------
-- Table structure for DEPOSIT
-- ----------------------------
DROP TABLE "SUMMER"."DEPOSIT";
CREATE TABLE "SUMMER"."DEPOSIT" (
  "ID" NUMBER NOT NULL ,
  "CARD_ID" NUMBER ,
  "TIME" DATE ,
  "MONEY" NUMBER 
)
TABLESPACE "USERS"
LOGGING
NOCOMPRESS
PCTFREE 10
INITRANS 1
STORAGE (
  INITIAL 65536 
  NEXT 1048576 
  MINEXTENTS 1
  MAXEXTENTS 2147483645
  BUFFER_POOL DEFAULT
)
PARALLEL 1
NOCACHE
DISABLE ROW MOVEMENT
;

-- ----------------------------
-- Records of DEPOSIT
-- ----------------------------
INSERT INTO "SUMMER"."DEPOSIT" VALUES ('1', '28', TO_DATE('2019-12-31 07:46:06', 'SYYYY-MM-DD HH24:MI:SS'), '123');
INSERT INTO "SUMMER"."DEPOSIT" VALUES ('12', '28', TO_DATE('2019-12-31 08:54:05', 'SYYYY-MM-DD HH24:MI:SS'), '123');
INSERT INTO "SUMMER"."DEPOSIT" VALUES ('13', '22', TO_DATE('2019-12-31 08:54:26', 'SYYYY-MM-DD HH24:MI:SS'), '555');
INSERT INTO "SUMMER"."DEPOSIT" VALUES ('15', '28', TO_DATE('2019-12-31 09:46:24', 'SYYYY-MM-DD HH24:MI:SS'), '1');
INSERT INTO "SUMMER"."DEPOSIT" VALUES ('17', '28', TO_DATE('2019-12-31 09:51:31', 'SYYYY-MM-DD HH24:MI:SS'), '2');
INSERT INTO "SUMMER"."DEPOSIT" VALUES ('18', '28', TO_DATE('2019-12-31 09:54:33', 'SYYYY-MM-DD HH24:MI:SS'), '12');
INSERT INTO "SUMMER"."DEPOSIT" VALUES ('19', '28', TO_DATE('2019-12-31 09:56:47', 'SYYYY-MM-DD HH24:MI:SS'), '12');
INSERT INTO "SUMMER"."DEPOSIT" VALUES ('20', '28', TO_DATE('2019-12-31 09:57:12', 'SYYYY-MM-DD HH24:MI:SS'), '1');
INSERT INTO "SUMMER"."DEPOSIT" VALUES ('21', '28', TO_DATE('2019-12-31 15:32:10', 'SYYYY-MM-DD HH24:MI:SS'), '123');
INSERT INTO "SUMMER"."DEPOSIT" VALUES ('22', '28', TO_DATE('2019-12-31 15:36:21', 'SYYYY-MM-DD HH24:MI:SS'), '123');
INSERT INTO "SUMMER"."DEPOSIT" VALUES ('24', '28', TO_DATE('2019-12-31 16:51:51', 'SYYYY-MM-DD HH24:MI:SS'), '34');
INSERT INTO "SUMMER"."DEPOSIT" VALUES ('25', '28', TO_DATE('2019-12-31 16:52:17', 'SYYYY-MM-DD HH24:MI:SS'), '23');
INSERT INTO "SUMMER"."DEPOSIT" VALUES ('2', '28', TO_DATE('2019-12-31 07:49:04', 'SYYYY-MM-DD HH24:MI:SS'), '123');
INSERT INTO "SUMMER"."DEPOSIT" VALUES ('3', '28', TO_DATE('2019-12-31 07:52:25', 'SYYYY-MM-DD HH24:MI:SS'), '123');
INSERT INTO "SUMMER"."DEPOSIT" VALUES ('4', '28', TO_DATE('2019-12-31 07:53:40', 'SYYYY-MM-DD HH24:MI:SS'), '123');
INSERT INTO "SUMMER"."DEPOSIT" VALUES ('5', '22', TO_DATE('2019-12-31 07:53:46', 'SYYYY-MM-DD HH24:MI:SS'), '122');
INSERT INTO "SUMMER"."DEPOSIT" VALUES ('6', '28', TO_DATE('2019-12-31 08:05:00', 'SYYYY-MM-DD HH24:MI:SS'), '111');
INSERT INTO "SUMMER"."DEPOSIT" VALUES ('7', '22', TO_DATE('2019-12-31 08:09:08', 'SYYYY-MM-DD HH24:MI:SS'), '111');
INSERT INTO "SUMMER"."DEPOSIT" VALUES ('8', '28', TO_DATE('2019-12-31 08:25:05', 'SYYYY-MM-DD HH24:MI:SS'), '111');
INSERT INTO "SUMMER"."DEPOSIT" VALUES ('9', '22', TO_DATE('2019-12-31 08:25:20', 'SYYYY-MM-DD HH24:MI:SS'), '111');
INSERT INTO "SUMMER"."DEPOSIT" VALUES ('10', '28', TO_DATE('2019-12-31 08:27:39', 'SYYYY-MM-DD HH24:MI:SS'), '111');
INSERT INTO "SUMMER"."DEPOSIT" VALUES ('11', '28', TO_DATE('2019-12-31 08:27:44', 'SYYYY-MM-DD HH24:MI:SS'), '11111111');
INSERT INTO "SUMMER"."DEPOSIT" VALUES ('14', '28', TO_DATE('2019-12-31 08:56:45', 'SYYYY-MM-DD HH24:MI:SS'), '111');
INSERT INTO "SUMMER"."DEPOSIT" VALUES ('16', '28', TO_DATE('2019-12-31 09:48:54', 'SYYYY-MM-DD HH24:MI:SS'), '1');
INSERT INTO "SUMMER"."DEPOSIT" VALUES ('23', '28', TO_DATE('2019-12-31 15:37:26', 'SYYYY-MM-DD HH24:MI:SS'), '123');

-- ----------------------------
-- Table structure for LOAN
-- ----------------------------
DROP TABLE "SUMMER"."LOAN";
CREATE TABLE "SUMMER"."LOAN" (
  "ID" NUMBER NOT NULL ,
  "CARD_ID" NUMBER ,
  "TIME" DATE ,
  "MONEY" NUMBER 
)
TABLESPACE "USERS"
LOGGING
NOCOMPRESS
PCTFREE 10
INITRANS 1
STORAGE (
  INITIAL 65536 
  NEXT 1048576 
  MINEXTENTS 1
  MAXEXTENTS 2147483645
  BUFFER_POOL DEFAULT
)
PARALLEL 1
NOCACHE
DISABLE ROW MOVEMENT
;

-- ----------------------------
-- Records of LOAN
-- ----------------------------
INSERT INTO "SUMMER"."LOAN" VALUES ('1', '28', TO_DATE('2019-12-31 09:56:30', 'SYYYY-MM-DD HH24:MI:SS'), '14');
INSERT INTO "SUMMER"."LOAN" VALUES ('2', '28', TO_DATE('2019-12-31 09:56:37', 'SYYYY-MM-DD HH24:MI:SS'), '23');
INSERT INTO "SUMMER"."LOAN" VALUES ('3', '28', TO_DATE('2019-12-31 16:51:43', 'SYYYY-MM-DD HH24:MI:SS'), '456');

-- ----------------------------
-- Table structure for MESSAGE
-- ----------------------------
DROP TABLE "SUMMER"."MESSAGE";
CREATE TABLE "SUMMER"."MESSAGE" (
  "ID" NUMBER NOT NULL ,
  "USERNUM" VARCHAR2(50 BYTE) ,
  "TYPES" VARCHAR2(25 BYTE) ,
  "STATUS" NUMBER ,
  "CONTENT" VARCHAR2(255 BYTE) ,
  "TIME" DATE 
)
TABLESPACE "USERS"
LOGGING
NOCOMPRESS
PCTFREE 10
INITRANS 1
STORAGE (
  INITIAL 65536 
  NEXT 1048576 
  MINEXTENTS 1
  MAXEXTENTS 2147483645
  BUFFER_POOL DEFAULT
)
PARALLEL 1
NOCACHE
DISABLE ROW MOVEMENT
;

-- ----------------------------
-- Records of MESSAGE
-- ----------------------------
INSERT INTO "SUMMER"."MESSAGE" VALUES ('3', '147258369', '贷款', '0', '卡号：28新增贷款 456.0', TO_DATE('2019-12-31 16:51:43', 'SYYYY-MM-DD HH24:MI:SS'));
INSERT INTO "SUMMER"."MESSAGE" VALUES ('4', '147258369', '存款', '0', '卡号：28新增存款 34.0', TO_DATE('2019-12-31 16:51:51', 'SYYYY-MM-DD HH24:MI:SS'));
INSERT INTO "SUMMER"."MESSAGE" VALUES ('5', '147258369', '存款', '0', '卡号：28新增存款 23.0', TO_DATE('2019-12-31 16:52:17', 'SYYYY-MM-DD HH24:MI:SS'));
INSERT INTO "SUMMER"."MESSAGE" VALUES ('1', '147258369', '存款', '0', '卡号：28新增存款 123.0', TO_DATE('2019-12-31 15:37:26', 'SYYYY-MM-DD HH24:MI:SS'));
INSERT INTO "SUMMER"."MESSAGE" VALUES ('2', '147258369', '取款', '0', '卡号：28新增取款 23.0', TO_DATE('2019-12-31 15:38:43', 'SYYYY-MM-DD HH24:MI:SS'));

-- ----------------------------
-- Table structure for REPAYLOAN
-- ----------------------------
DROP TABLE "SUMMER"."REPAYLOAN";
CREATE TABLE "SUMMER"."REPAYLOAN" (
  "ID" NUMBER NOT NULL ,
  "CARD_ID" NUMBER ,
  "TIME" DATE ,
  "MONEY" NUMBER 
)
TABLESPACE "USERS"
LOGGING
NOCOMPRESS
PCTFREE 10
INITRANS 1
STORAGE (
  INITIAL 65536 
  NEXT 1048576 
  MINEXTENTS 1
  MAXEXTENTS 2147483645
  BUFFER_POOL DEFAULT
)
PARALLEL 1
NOCACHE
DISABLE ROW MOVEMENT
;

-- ----------------------------
-- Records of REPAYLOAN
-- ----------------------------
INSERT INTO "SUMMER"."REPAYLOAN" VALUES ('1', '28', TO_DATE('2019-12-31 09:59:01', 'SYYYY-MM-DD HH24:MI:SS'), '1');

-- ----------------------------
-- Table structure for SIGNON
-- ----------------------------
DROP TABLE "SUMMER"."SIGNON";
CREATE TABLE "SUMMER"."SIGNON" (
  "ID" NUMBER NOT NULL ,
  "USERNUM" VARCHAR2(50 BYTE) ,
  "PASSWD" VARCHAR2(100 BYTE) 
)
TABLESPACE "USERS"
LOGGING
NOCOMPRESS
PCTFREE 10
INITRANS 1
STORAGE (
  INITIAL 65536 
  NEXT 1048576 
  MINEXTENTS 1
  MAXEXTENTS 2147483645
  BUFFER_POOL DEFAULT
)
PARALLEL 1
NOCACHE
DISABLE ROW MOVEMENT
;

-- ----------------------------
-- Records of SIGNON
-- ----------------------------
INSERT INTO "SUMMER"."SIGNON" VALUES ('8', '123', '123');
INSERT INTO "SUMMER"."SIGNON" VALUES ('6', '147258369', '1');

-- ----------------------------
-- Table structure for SUBSCRIBE
-- ----------------------------
DROP TABLE "SUMMER"."SUBSCRIBE";
CREATE TABLE "SUMMER"."SUBSCRIBE" (
  "ID" NUMBER NOT NULL ,
  "USERNUM" VARCHAR2(50 BYTE) ,
  "SERVICE" VARCHAR2(50 BYTE) 
)
TABLESPACE "USERS"
LOGGING
NOCOMPRESS
PCTFREE 10
INITRANS 1
STORAGE (
  INITIAL 65536 
  NEXT 1048576 
  MINEXTENTS 1
  MAXEXTENTS 2147483645
  BUFFER_POOL DEFAULT
)
PARALLEL 1
NOCACHE
DISABLE ROW MOVEMENT
;

-- ----------------------------
-- Records of SUBSCRIBE
-- ----------------------------
INSERT INTO "SUMMER"."SUBSCRIBE" VALUES ('5', '147258369', 'repayLoan');
INSERT INTO "SUMMER"."SUBSCRIBE" VALUES ('6', '147258369', 'deposit');
INSERT INTO "SUMMER"."SUBSCRIBE" VALUES ('7', '147258369', 'withdraw');
INSERT INTO "SUMMER"."SUBSCRIBE" VALUES ('8', '147258369', 'loan');

-- ----------------------------
-- Table structure for USERINFO
-- ----------------------------
DROP TABLE "SUMMER"."USERINFO";
CREATE TABLE "SUMMER"."USERINFO" (
  "ID" NUMBER NOT NULL ,
  "FIRSTNAME" VARCHAR2(50 BYTE) ,
  "LASTNAME" VARCHAR2(20 BYTE) ,
  "EMAIL" VARCHAR2(50 BYTE) ,
  "PHONE" VARCHAR2(50 BYTE) ,
  "USERNUM" VARCHAR2(50 BYTE) ,
  "POSITION" VARCHAR2(50 BYTE) ,
  "CITY" VARCHAR2(50 BYTE) ,
  "ADDRESS" VARCHAR2(50 BYTE) ,
  "DESCRIPTION" VARCHAR2(255 BYTE) 
)
TABLESPACE "USERS"
LOGGING
NOCOMPRESS
PCTFREE 10
INITRANS 1
STORAGE (
  INITIAL 65536 
  NEXT 1048576 
  MINEXTENTS 1
  MAXEXTENTS 2147483645
  BUFFER_POOL DEFAULT
)
PARALLEL 1
NOCACHE
DISABLE ROW MOVEMENT
;

-- ----------------------------
-- Records of USERINFO
-- ----------------------------
INSERT INTO "SUMMER"."USERINFO" VALUES ('22', 'Tian', 'Xia', NULL, NULL, '123', NULL, NULL, NULL, NULL);
INSERT INTO "SUMMER"."USERINFO" VALUES ('1', 'yan', 'zhang', '6895526@qq.com', '15489563475', '147258369', '***', '**', '****', '这是一个银行管理系统');

-- ----------------------------
-- Table structure for WITHDRAW
-- ----------------------------
DROP TABLE "SUMMER"."WITHDRAW";
CREATE TABLE "SUMMER"."WITHDRAW" (
  "ID" NUMBER NOT NULL ,
  "CARD_ID" NUMBER ,
  "TIME" DATE ,
  "MONEY" NUMBER 
)
TABLESPACE "USERS"
LOGGING
NOCOMPRESS
PCTFREE 10
INITRANS 1
STORAGE (
  INITIAL 65536 
  NEXT 1048576 
  MINEXTENTS 1
  MAXEXTENTS 2147483645
  BUFFER_POOL DEFAULT
)
PARALLEL 1
NOCACHE
DISABLE ROW MOVEMENT
;

-- ----------------------------
-- Records of WITHDRAW
-- ----------------------------
INSERT INTO "SUMMER"."WITHDRAW" VALUES ('1', '28', TO_DATE('2019-12-31 08:49:36', 'SYYYY-MM-DD HH24:MI:SS'), '936');
INSERT INTO "SUMMER"."WITHDRAW" VALUES ('2', '28', TO_DATE('2019-12-31 08:54:17', 'SYYYY-MM-DD HH24:MI:SS'), '123');
INSERT INTO "SUMMER"."WITHDRAW" VALUES ('3', '28', TO_DATE('2019-12-31 09:51:47', 'SYYYY-MM-DD HH24:MI:SS'), '11111110');
INSERT INTO "SUMMER"."WITHDRAW" VALUES ('4', '28', TO_DATE('2019-12-31 09:56:30', 'SYYYY-MM-DD HH24:MI:SS'), '14');
INSERT INTO "SUMMER"."WITHDRAW" VALUES ('5', '22', TO_DATE('2019-12-31 15:28:18', 'SYYYY-MM-DD HH24:MI:SS'), '22');
INSERT INTO "SUMMER"."WITHDRAW" VALUES ('6', '28', TO_DATE('2019-12-31 15:38:43', 'SYYYY-MM-DD HH24:MI:SS'), '23');

-- ----------------------------
-- Function structure for ADD_MESSAGE
-- ----------------------------
CREATE OR REPLACE
PROCEDURE "SUMMER"."ADD_MESSAGE" AS
BEGIN
	-- 增加消息记录
	INSERT INTO MESSAGE (USERNUM, TYPES, STATUS, CONTENT, TIME)
	VALUES (userNum_, type_, status_, content_, time_);
END;
/

-- ----------------------------
-- Function structure for DEAL_LOAN
-- ----------------------------
CREATE OR REPLACE
PROCEDURE "SUMMER"."DEAL_LOAN" AS
BEGIN
	-- 更新卡余额
	UPDATE CARD SET BALANCE = BALANCE - money
	WHERE ID = cardId;
	
	-- 记录贷款过程
	INSERT INTO LOAN (CARD_ID, TIME, MONEY) 
	VALUES (cardId, time, money);
END;
/

-- ----------------------------
-- Function structure for DEPOSIT_MONEY
-- ----------------------------
CREATE OR REPLACE
PROCEDURE "SUMMER"."DEPOSIT_MONEY" AS
BEGIN
	-- 记录存款过程
	INSERT INTO DEPOSIT (CARD_ID, TIME, MONEY) 
	VALUES (cardId, time, money);
	
	-- 更新卡余额
	UPDATE CARD SET BALANCE = BALANCE + money
	WHERE ID = cardId;
END;
/

-- ----------------------------
-- Function structure for REGISTER_USER
-- ----------------------------
CREATE OR REPLACE
PROCEDURE "SUMMER"."REGISTER_USER" AS
BEGIN
	INSERT INTO USERINFO (FIRSTNAME, LASTNAME, EMAIL, PHONE, USERNUM, POSITION, CITY, ADDRESS, DESCRIPTION) 
	VALUES (firstName, lastName, email, phone, userNum, position, city, address, description);
END;
/

-- ----------------------------
-- Function structure for REPAY_LOAN
-- ----------------------------
CREATE OR REPLACE
PROCEDURE "SUMMER"."REPAY_LOAN" AS
BEGIN
	-- 更新卡余额
	UPDATE CARD SET BALANCE = BALANCE + money
	WHERE ID = cardId;
	
	-- 记录还款过程
	INSERT INTO REPAYLOAN (CARD_ID, TIME, MONEY) 
	VALUES (cardId, time, money);
END;
/

-- ----------------------------
-- Function structure for SELECT_CARD
-- ----------------------------
CREATE OR REPLACE
PROCEDURE "SUMMER"."SELECT_CARD" AS
BEGIN
	DECLARE
		CARD_NUM VARCHAR2(50);
		BALANCE NUMBER;
		CARD_ID NUMBER;

		CURSOR CARD_BY_ID_CURSOR IS 
			SELECT CARD.ID, CARD.CARD_NUM, CARD.BALANCE FROM CARD
			WHERE CARD.USER_ID = input_user_id
			ORDER BY CARD.CREATE_TIME;
	
  BEGIN
	  card_count NUMBER;
		SELECT COUNT(*) INTO card_count FROM CARD WHERE USER_ID = input_user_id;
-- 		OPEN CARD_BY_ID_CURSOR;
-- 		WHILE card_count > 0
-- 			LOOP
-- 				FETCH CARD_BY_ID_CURSOR INTO CARD_ID,CARD_NUM,BALANCE;
-- 				DBMS_OUTPUT.PUT_LINE('银行卡ID:'||CARD_ID||','||'银行卡NUM:'||CARD_NUM||'余额:'||BALANCE);
-- 				card_count := card_count - 1;
-- 			END LOOP;
		EXCEPTION
			WHEN NO_DATA_FOUND THEN
				DBMS_OUTPUT.PUT_LINE('NO_DATA_FOUND');
		CLOSE CARD_BY_ID_CURSOR;
	END CARD_BY_ID_CURSOR;
END;
/

-- ----------------------------
-- Function structure for UPDATA_USERINFO
-- ----------------------------
CREATE OR REPLACE
PROCEDURE "SUMMER"."UPDATA_USERINFO" AS
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

-- ----------------------------
-- Function structure for WITHDRAW_MONEY
-- ----------------------------
CREATE OR REPLACE
PROCEDURE "SUMMER"."WITHDRAW_MONEY" AS
BEGIN
	-- 更新卡余额
	UPDATE CARD SET BALANCE = BALANCE - money
	WHERE ID = cardId;
	
	-- 记录存款过程
	INSERT INTO WITHDRAW (CARD_ID, TIME, MONEY) 
	VALUES (cardId, time, money);
END;
/

-- ----------------------------
-- Sequence structure for CARD_ID_SEQ
-- ----------------------------
DROP SEQUENCE "SUMMER"."CARD_ID_SEQ";
CREATE SEQUENCE "SUMMER"."CARD_ID_SEQ" MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 CACHE 20;

-- ----------------------------
-- Sequence structure for DEPOSIT_ID_SEQ
-- ----------------------------
DROP SEQUENCE "SUMMER"."DEPOSIT_ID_SEQ";
CREATE SEQUENCE "SUMMER"."DEPOSIT_ID_SEQ" MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 CACHE 20;

-- ----------------------------
-- Sequence structure for LOAN_ID_SEQ
-- ----------------------------
DROP SEQUENCE "SUMMER"."LOAN_ID_SEQ";
CREATE SEQUENCE "SUMMER"."LOAN_ID_SEQ" MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 CACHE 20;

-- ----------------------------
-- Sequence structure for MESSAGE_ID_SEQ
-- ----------------------------
DROP SEQUENCE "SUMMER"."MESSAGE_ID_SEQ";
CREATE SEQUENCE "SUMMER"."MESSAGE_ID_SEQ" MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 CACHE 20;

-- ----------------------------
-- Sequence structure for REPAYLOAN_ID_SEQ
-- ----------------------------
DROP SEQUENCE "SUMMER"."REPAYLOAN_ID_SEQ";
CREATE SEQUENCE "SUMMER"."REPAYLOAN_ID_SEQ" MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 CACHE 20;

-- ----------------------------
-- Sequence structure for SIGNON_ID_SEQ
-- ----------------------------
DROP SEQUENCE "SUMMER"."SIGNON_ID_SEQ";
CREATE SEQUENCE "SUMMER"."SIGNON_ID_SEQ" MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 CACHE 20;

-- ----------------------------
-- Sequence structure for SUBSCRIBE_ID_SEQ
-- ----------------------------
DROP SEQUENCE "SUMMER"."SUBSCRIBE_ID_SEQ";
CREATE SEQUENCE "SUMMER"."SUBSCRIBE_ID_SEQ" MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 CACHE 20;

-- ----------------------------
-- Sequence structure for USERINFO_ID_SEQ
-- ----------------------------
DROP SEQUENCE "SUMMER"."USERINFO_ID_SEQ";
CREATE SEQUENCE "SUMMER"."USERINFO_ID_SEQ" MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 CACHE 20;

-- ----------------------------
-- Sequence structure for USER_CARD_ID_SEQ
-- ----------------------------
DROP SEQUENCE "SUMMER"."USER_CARD_ID_SEQ";
CREATE SEQUENCE "SUMMER"."USER_CARD_ID_SEQ" MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 CACHE 20;

-- ----------------------------
-- Sequence structure for WITHDRAW_ID_SEQ
-- ----------------------------
DROP SEQUENCE "SUMMER"."WITHDRAW_ID_SEQ";
CREATE SEQUENCE "SUMMER"."WITHDRAW_ID_SEQ" MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 CACHE 20;

-- ----------------------------
-- Primary Key structure for table CARD
-- ----------------------------
ALTER TABLE "SUMMER"."CARD" ADD CONSTRAINT "SYS_C0010868" PRIMARY KEY ("ID");

-- ----------------------------
-- Triggers structure for table CARD
-- ----------------------------
CREATE TRIGGER "SUMMER"."CARD_ID" BEFORE INSERT ON "SUMMER"."CARD" REFERENCING OLD AS "OLD" NEW AS "NEW" FOR EACH ROW 
begin 
	select card_id_seq.nextval into :new.id from dual;
end;
/

-- ----------------------------
-- Primary Key structure for table DEPOSIT
-- ----------------------------
ALTER TABLE "SUMMER"."DEPOSIT" ADD CONSTRAINT "SYS_C0010862" PRIMARY KEY ("ID");

-- ----------------------------
-- Triggers structure for table DEPOSIT
-- ----------------------------
CREATE TRIGGER "SUMMER"."DEPOSIT_ID" BEFORE INSERT ON "SUMMER"."DEPOSIT" REFERENCING OLD AS "OLD" NEW AS "NEW" FOR EACH ROW 
begin 
	select deposit_id_seq.nextval into :new.id from dual;
end;
/

-- ----------------------------
-- Primary Key structure for table LOAN
-- ----------------------------
ALTER TABLE "SUMMER"."LOAN" ADD CONSTRAINT "SYS_C0010864" PRIMARY KEY ("ID");

-- ----------------------------
-- Triggers structure for table LOAN
-- ----------------------------
CREATE TRIGGER "SUMMER"."LOAN_ID" BEFORE INSERT ON "SUMMER"."LOAN" REFERENCING OLD AS "OLD" NEW AS "NEW" FOR EACH ROW 
begin 
	select loan_id_seq.nextval into :new.id from dual;
end;
/

-- ----------------------------
-- Primary Key structure for table MESSAGE
-- ----------------------------
ALTER TABLE "SUMMER"."MESSAGE" ADD CONSTRAINT "SYS_C0010869" PRIMARY KEY ("ID");

-- ----------------------------
-- Triggers structure for table MESSAGE
-- ----------------------------
CREATE TRIGGER "SUMMER"."MESSAGE_ID" BEFORE INSERT ON "SUMMER"."MESSAGE" REFERENCING OLD AS "OLD" NEW AS "NEW" FOR EACH ROW 
begin 
	select message_id_seq.nextval into :new.id from dual;
end;
/

-- ----------------------------
-- Primary Key structure for table REPAYLOAN
-- ----------------------------
ALTER TABLE "SUMMER"."REPAYLOAN" ADD CONSTRAINT "SYS_C0010865" PRIMARY KEY ("ID");

-- ----------------------------
-- Triggers structure for table REPAYLOAN
-- ----------------------------
CREATE TRIGGER "SUMMER"."REPAYLOAN_ID" BEFORE INSERT ON "SUMMER"."REPAYLOAN" REFERENCING OLD AS "OLD" NEW AS "NEW" FOR EACH ROW 
begin 
	select repayloan_id_seq.nextval into :new.id from dual;
end;
/

-- ----------------------------
-- Primary Key structure for table SIGNON
-- ----------------------------
ALTER TABLE "SUMMER"."SIGNON" ADD CONSTRAINT "SYS_C0010859" PRIMARY KEY ("ID");

-- ----------------------------
-- Triggers structure for table SIGNON
-- ----------------------------
CREATE TRIGGER "SUMMER"."SIGNON_ID" BEFORE INSERT ON "SUMMER"."SIGNON" REFERENCING OLD AS "OLD" NEW AS "NEW" FOR EACH ROW 
begin 
	select signon_id_seq.nextval into :new.id from dual;
end;
/

-- ----------------------------
-- Primary Key structure for table SUBSCRIBE
-- ----------------------------
ALTER TABLE "SUMMER"."SUBSCRIBE" ADD CONSTRAINT "SYS_C0010870" PRIMARY KEY ("ID");

-- ----------------------------
-- Triggers structure for table SUBSCRIBE
-- ----------------------------
CREATE TRIGGER "SUMMER"."SUBSCRIBE_ID" BEFORE INSERT ON "SUMMER"."SUBSCRIBE" REFERENCING OLD AS "OLD" NEW AS "NEW" FOR EACH ROW 
begin 
	select subscribe_id_seq.nextval into :new.id from dual;
end;
/

-- ----------------------------
-- Primary Key structure for table USERINFO
-- ----------------------------
ALTER TABLE "SUMMER"."USERINFO" ADD CONSTRAINT "SYS_C0010858" PRIMARY KEY ("ID");

-- ----------------------------
-- Triggers structure for table USERINFO
-- ----------------------------
CREATE TRIGGER "SUMMER"."USERINFO_ID" BEFORE INSERT ON "SUMMER"."USERINFO" REFERENCING OLD AS "OLD" NEW AS "NEW" FOR EACH ROW 
begin 
	select userinfo_id_seq.nextval into :new.id from dual;
end;
/

-- ----------------------------
-- Primary Key structure for table WITHDRAW
-- ----------------------------
ALTER TABLE "SUMMER"."WITHDRAW" ADD CONSTRAINT "SYS_C0010863" PRIMARY KEY ("ID");

-- ----------------------------
-- Triggers structure for table WITHDRAW
-- ----------------------------
CREATE TRIGGER "SUMMER"."WITHDRAW_ID" BEFORE INSERT ON "SUMMER"."WITHDRAW" REFERENCING OLD AS "OLD" NEW AS "NEW" FOR EACH ROW 
begin 
	select withdraw_id_seq.nextval into :new.id from dual;
end;
/
