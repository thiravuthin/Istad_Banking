--Mobile Banking API
----------------------------------------
--1. Account Type
--2. User
--3. Account
--4. Payment (Top up - Phone number | Education)
--5. Transfer (+ amount, - amount)
--6. History | Transaction
--7. Notification ~One Signal


create table if not exists account_types (
   id serial primary key,
   name varchar(255)
);

-- drop table accounts
CREATE TABLE if not exists accounts (
    "id" SERIAL PRIMARY KEY,
    "account_no" varchar,
    "account_name" varchar(255),
    "profile" varchar(255),
    "pin" int4,
    "password" varchar(255),
    "phone_number" varchar,
    "transfer_Limit" int4,
    "account_type" int4,
    constraint fk_account_type
    foreign key ("account_type")
    references account_types("id")
);

drop table users;
create table if not exists "users" (
   "id"  serial primary key,
   "name" varchar(255),
   "gender" varchar(255),
   "one_signal_id" varchar(255),
   "is_deleted" bool,
   "is_student" bool,
   "student_card_id" varchar(255),
    "email" varchar(255),
   "password" varchar(255),
   "is_verified" bool,
   "verify_code" varchar(255)
);

-- DROP TABLE "user_accounts";
create table if not exists "user_accounts" (
   "id" serial primary key,
   "user_id" int4,
   "account_id" int4,
   "created_at" timestamp,
   "is_disabled" bool,
   constraint fk_account_id
   foreign key ("account_id")
   references "accounts"("id")
);

-- DROP TABLE transactions;
create table if not exists "transactions" (
      "id" serial primary key,
      "HS_account_id" int4,
      "Leer_account_id" int4,
      "amount" money,
      "remark" varchar(255),
      "is_payment" bool,
      "payment_id" int4,
      "phone_number" varchar(20),
      "transfered_at" timestamp,
       constraint fk_Leer_account_id
       foreign key ("Leer_account_id")
       references "accounts"("id")
);

--drop table notifications;
create table if not exists "notifications" (
     "id" serial primary key,
     "content" varchar(255),
     "transacted_at" timestamp,
     "transaction_id" int4,
     "sender_id" int4,
     "receiver_id" int4

);
