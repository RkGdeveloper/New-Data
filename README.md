Refer this database:

================================================================================================================================

SQL> DESC recharge;
 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------

 RECHARGE_ID                               NOT NULL NUMBER(38)
 PACKNAME                                           VARCHAR2(30)
 PACKAMT                                            NUMBER(38)

SQL> DESC rechargetransactions;
 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------

 TRANSACTION_ID                            NOT NULL NUMBER(38)
 RECH_ID                                            NUMBER(38)
 MOBILE_NUMBER                                      NUMBER(10)
 COUPN_CD                                           VARCHAR2(10)

SQL> select * from recharge;

RECHARGE_ID PACKNAME                          PACKAMT
----------- ------------------------------ ----------
        101 P50                                    50
        102 FT100                                 100
        103 T150                                  150

SQL> select * from rechargetransactions;

TRANSACTION_ID    RECH_ID MOBILE_NUMBER COUPN_CD
-------------- ---------- ------------- ----------
           100        101    7845124578 T10
           101        102    8286301908 T10
           102        103    4578124578 T10
           103        101    7845124578 T10

SQL>
