-- hr 데이터 베이스 사용하기 명령어 작성
use hr;
-- hr 데이터 베이스의 테이블 목록 보기
show tables;
-- employees(직원) 테이블의 구조(어떠한 캘럼이 있는지) 조회 해보세요.
desc employees;
-- employees(직원) 테이블의 모든 행의 모든 열을 조회해보세요.
select * from employees;
-- 직원 테이블의 First_Name(이름) 열의 값이 'John' 인 직원 조회.
select * from employees where FIRST_NAME like 'john';
-- 직원 테이블의 Last_Name(성) 열의 값이 'John을 포함하는 값' 인 직원 조회.
select * from employees where LAST_NAME like 'john%' or '%john';
select * from employees where LAST_NAME like '%john%';
-- 직원 테이블의 이름의 값이 6글자인 직원 조회
select * from employees where FIRST_NAME like '______';
select * from employees where char_length(First_Name) = 6;
-- 직원 테이블 salary(연봉) 열의 값이 10000 ~ 15000 인 직원 조회
select * from employees where SALARY between 10000 and 15000;
-- 직원 테이블의 이름, 성, 연봉 컬럼과 연봉의 6%를 연산하여 'tax' 라는 별명의 컬럼으로 조회하세요.
select FIRST_NAME as '이름', LAST_NAME as '이름', SALARY as '연봉'
, round(salary * 0.06, 0) as 'tax'
 from employees;