//-- 2022-01-04 SELECT ��������(������ ����)
//-- �չ����� ���� �ڹ����� ����� �÷� 
///*
//      ���̺�� : emp
//      �����ȣ : empno
//      ����� : ename
//      �޿� : sal
//      �Ի����� : hiredate
//      ���� : job
//     �μ���ȣ : deptno
//      ������: comm
//*/
//-- �񱳿����� (=)
//-- <<1>>  �μ� ��ȣ�� 10���� �μ��� ��� �� �����ȣ, �̸�, �޿��� ����϶�.
//SELECT empno,ename,sal
//FROM emp
//WHERE  deptno=10;
//-- �񱳿����� (=)
//-- <<2>>  �����ȣ�� 7698�� ��� �� �̸�, �Ի�����, �μ���ȣ�� ����϶�.
//SELECT ename,hiredate,deptno
//FROM emp
//WHERE empno=7698;
//-- �񱳿����� (=) ==> ���ڿ� / ��¥ => ''
//-- <<3>>  �̸��� ALLEN�� ����� ��� ������ ����϶�.
//SELECT  *
//FROM emp
//WHERE ename='ALLEN';
//-- �񱳿����� (=)
//-- <<4>>  �Ի����ڰ� 83/01/12�� ����� �̸�, �μ� ��ȣ, �޿��� ����϶�.
//SELECT ename,deptno,sal
//FROM emp
//WHERE hiredate='83/01/12';
//-- �񱳿����� (!= , <>)
//-- ����� �����ʹ� ��ҹ��ڸ� �����Ѵ� 
//-- <<5>>  ������ MANAGER�� �ƴ� ����� ��� ������ ����϶�.
//SELECT *
//FROM emp
//WHERE job<>'MANAGER';
//-- �񱳿����� (=)
//-- <<6>>  �Ի����ڰ� 81/04/02 ���Ŀ� �Ի��� ����� ������ ����϶�.
//SELECT * 
//FROM emp
//WHERE hiredate>'81/04/02';
//-- �񱳿����� (>=)
//-- <<7>>  �޿��� $800�̻��� ����� �̸�, �޿�, �μ� ��ȣ�� ����϶�.
//SELECT  ename,sal,deptno
//FROM emp
//WHERE sal>=800;
//-- �񱳿����� (>)
//-- <<8>>  �μ���ȣ�� 20�� �̻��� ����� ��� ������ ����϶�.
//SELECT *
//FROM emp
//WHERE deptno>=20;
//-- �񱳿����� (>) => ���ĺ� ���� => ��¥,���ڿ� 
//-- <<9>>  ������ K�� �����ϴ� ������� ���� �̸��� ���� ����� ��� ������ ����϶�.
//SELECT *
//FROM emp
//WHERE ename>'K';
//-- �񱳿����� (>)   
//-- <<10>>  �Ի����ڰ� 81/12/03 ���� ���� �Ի��� ������� ��� ������ ����϶�.
//SELECT  * 
//FROM  emp
//WHERE hiredate<'81/12/03';
//-- �񱳿����� ( <= ) 
//-- <<11>>  �Ի��ȣ�� 7698 ���� �۰ų� ���� ������� �Ի��ȣ�� �̸��� ����϶�.
//SELECT empno,ename
//FROM emp
//WHERE	empno<=7698;
//-- �������� ( AND ) => BETWEEN ������ 
//-- <<12>>  �Ի����ڰ� 81/04/02 ���� �ʰ� 82/12/09 ���� ���� ����� �̸�, ����, �μ� ��ȣ�� ����϶�.
//SELECT ename,sal,deptno
//FROM emp
//WHERE hiredate>='81/04/02' AND hiredate<='82/12/09';
//
//SELECT ename,sal,deptno
//FROM emp
//WHERE hiredate BETWEEN '81/04/02' AND '82/12/09';
//-- �������� ( AND)
//-- <<13>>  �޿��� 1,600 ���� ũ�� $3,000���� ���� ����� �̸�, ����, �޿��� ����϶�.
//SELECT ename,job,sal
//FROM emp
//WHERE sal>1600 AND sal<3000;
//-- NOT BETWEEN 
//-- <<14>>  �����ȣ�� 7654�� 7788 ���� �̿��� ����� ��� ������ ����϶�.
//SELECT * 
//FROM emp
//WHERE empno NOT BETWEEN 7654 AND 7788;
//-- BETWEEN
//-- <<15>> �̸��� B�� J ������ ��� ����� ������ ����϶�.
//SELECT *
//FROM emp
//WHERE ename BETWEEN 'B' AND 'J';
//-- NOT LIKE
//-- <<16>>  �Ի����ڰ� 81�� �̿ܿ� �Ի��� ����� ��� ������ ����϶�.
//SELECT *
//FROM emp
//WHERE hiredate NOT LIKE '81%';
//
//SELECT *
//FROM emp
//WHERE NOT (hiredate>='81/01/01' AND hiredate<='81/12/31');
//
//SELECT *
//FROM emp
//WHERE hiredate NOT BETWEEN '81/01/01' AND '81/12/31';
//-- OR,IN
//-- <<17>>  ������ MANAGER�� SALESMAN�� ����� ��� ������ ����϶�.
//SELECT *
//FROM emp
//WHERE job IN('MANAGER','SALESMAN'); 
//
//SELECT *
//FROM emp
//WHERE job='MANAGER' OR job='SALESMAN';
//-- NOT IN
//-- <<18>>  �μ� ��ȣ�� 20,30���� ������ ��� ����� �̸�, �����ȣ, �μ� ��ȣ�� ����϶�.
//SELECT ename,empno,deptno
//FROM emp
//WHERE deptno NOT IN(20,30);
//
//SELECT ename,empno,deptno
//FROM emp
//WHERE NOT (deptno=20 OR deptno=30);
//-- LIKE	
//-- <<19>>  �̸��� S�� �����ϴ� ����� �����ȣ, �̸�, �Ի�����, �μ���ȣ�� ����϶�.
//SELECT empno,ename,hiredate,deptno
//FROM emp
//WHERE ename LIKE 'S%';
//-- LIKE
//-- <<20>>  �Ի����ڰ� 81�⵵�� ����� ��� ������ ����϶�.
//SELECT *
//FROM emp
//WHERE hiredate LIKE '81%';
//-- LIKE
//-- <<21>>  �̸� �� S�ڰ� �� �ִ� ����� ��� ������ ����϶�.
//SELECT * 
//FROM emp
//WHERE ename LIKE '%S%';
//-- LIKE 
//-- <<22>>  �̸��� S�� �����ϰ� ������ ���ڰ� T�� ����� ��� ������ ����϶� (��, �̸��� ��ü 5�ڸ��̴�.>> 
//SELECT *
//FROM emp
//WHERE  ename LIKE 'S___T';                 
//-- LIKE (_ , %)
//-- <<23>>  ù ��° ���ڴ� ������� �� ��° ���ڰ� A�� ����� ������ ����϶�.
//SELECT *
//FROM emp
//WHERE ename LIKE '_A%';
//-- NULL    
//-- <<24>>  Ŀ�̼��� NULL�� ����� ������ ����϶�.
//SELECT * 
//FROM emp
//WHERE comm IS NULL;	
//-- NULL
//-- <<25>>  Ŀ�̼��� NULL�� �ƴ� ����� ��� ������ ����϶�.
//SELECT * 
//FROM emp
//WHERE comm IS NOT NULL;	
//-- AND 
//-- <<26>>  �μ��� 30�� �μ��̰� �޿��� $1,500 �̻��� ����� �̸�, �μ�, ������ ����϶�.
//SELECT ename,deptno,sal
//FROM emp
//WHERE deptno=30 AND sal>=1500;
//-- AND
//-- <<27>>  �̸��� ù ���ڰ� K�� �����ϰų� �μ� ��ȣ�� 30�� ����� �����ȣ, �̸�, �μ� ��ȣ�� ����϶�.
//SELECT empno,ename,deptno
//FROM emp
//WHERE ename LIKE 'K%' OR deptno=30;
//-- AND 	
//-- <<28>>  �޿��� $1,500�̻��̰� �μ� ��ȣ�� 30���� ��� �� ������ MANAGER�� ����� ������ ����϶�.
//SELECT *
//FROM emp
//WHERE sal>=1500 AND deptno=30 AND job='MANAGER';