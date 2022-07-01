package com.test.rest.vo;

public class TestVo {
	
	private int     empno;
	private String  ename;
	private String  deptno;
	
	public TestVo() {}

	public TestVo(int empno, String ename, String deptno) {
		this.empno = empno;
		this.ename = ename;
		this.deptno = deptno;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getDeptno() {
		return deptno;
	}

	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}

}