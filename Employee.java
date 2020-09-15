import java.io.*;
import java.util.*;
class Employee 
{
    private int id[] = { 1001, 1002, 1003, 1004, 1005, 1006, 1007 };
    private String name[] = { "Ashish", "Sushma", "Rahul", "Chahat", "Ranjan", "Suman", "Tanmay" };
    private String date[] = { "01/04/2009", "23/08/2012", "12/11/2008", "29/01/2013", "16/07/2005", "1/1/2000","12/06/2006" };
    private char design_code[] = { 'e', 'c', 'k', 'r', 'm', 'e', 'c' };
    private String dept[] = { "R&D", "PM", "Acct", "Front Desk", "Engg", "Manufacturing", "PM" };
    private int basic[] = { 20000, 30000, 10000, 12000, 50000, 23000, 29000 };
    private int hra[] = { 8000, 12000, 8000, 6000, 20000, 9000, 12000 };
    private int it[] = { 3000, 9000, 1000, 2000, 20000, 4400, 10000 };
	int n=id.length;
	private int DA(int i) 
	{
        char desi= design_code[i];
        switch(desi) {
            case 'e': return 20000;
            case 'c': return 32000;
            case 'k': return 12000;
            case 'r': return 15000;
            case 'm': return 40000;
        }
        return 0;
    }
	private char getDesigCode(int id) 
	{
        return design_code[getIndex(id)];
    }
	private int getIndex(int temp) 
	{
        int index = -1;
        for(int i=0;i<n;i++)
		{
            if(temp==id[i]) 
			{
                index = i;
                break;
            }
        }
        return index;
	}
	
	public String getName(int i) 
	{
      return name[getIndex(i)];
    }
	public String getDept(int i) 
	{
      return dept[getIndex(i)];
    }
	public String getDesignation(int i) 
	{
		char d = getDesigCode(i);
        switch(d)
		{
            case 'e': return "Engineer";
            case 'c': return "Consultant";
            case 'k': return "Clerk";
            case 'r': return "Receptionist";
            case 'm': return "Manager";
        }
        return "";
    }
	public int getSalary(int id)
	{
        int index = getIndex(id);
        if(index ==-1)
			return -1;
        return (basic[index] + hra[index] - it[index] + DA(index));
    }
	public static void main(String args[])
	{
		int emp_id = Integer.parseInt(args[0]);
		Employee emp = new Employee();
		System.out.println("Emp No.    Emp Name    Department    Designation    Salary");
		System.out.printf("%5d    ", emp_id);
		System.out.printf("%9s  ", emp.getName(emp_id));
		System.out.printf("%10s     ", emp.getDept(emp_id));
		System.out.printf("%11s    ", emp.getDesignation(emp_id));
		System.out.printf("%7d\n", emp.getSalary(emp_id));
	}
}