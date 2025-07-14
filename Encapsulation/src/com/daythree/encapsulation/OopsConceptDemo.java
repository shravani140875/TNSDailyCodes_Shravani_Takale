package com.daythree.encapsulation;

public class OopsConceptDemo {
	
		private int serialNum;
		private String name;
		private int age;
		
		public void setSerialNum(int serialNum)
		{
			this.serialNum = serialNum;
		}
		
		public int getSerialNum()
		{
			return serialNum;
		}
	
		public void setName(String name)
		{
			this.name = name;
		}
		
		public String getName()
		{
			return name;
		}
		
		public void setAge(int age)
		{
			this.age = age;
		}
		
		public int getAge()
		{
			return age;
		}

		@Override
		public String toString() {
			return "OopsConceptDemo [serialNum =" + serialNum + ", name =" + name + ", age =" + age + "]";
		}

}
