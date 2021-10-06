import java.util.*;
public class project
{
    String name;
    int id;
    float salary;
    public void load()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of employee");
        name=sc.nextLine();
        System.out.println("Enter id of employee");
        id=sc.nextInt();
        System.out.println("Enter annunal salary of employee");
        salary=sc.nextFloat();

    }

    public void addNew()
    {

    }

    public void display()
    {
        System.out.println(id+" "+name+" "+salary);
    }

    public void retrieve4()
    {

    }

    public void retrieve5()
    {

    }
} 
class xyz
{
    public static void main(String args[])
    {
        project obj[]=new project[100];
        Scanner d=new Scanner(System.in);
        int s,n,i,x;
        do
        {
            System.out.println("Press 1 to load employees' data");
            System.out.println("Press 2 to add new employee");
            System.out.println("Press 3 to display all employees");
            System.out.println("Press 4 to retrieve specific employee’s data");
            System.out.println("Press 5 to retrieve employees with salaries based on range");
            System.out.println("Press 6 to Exit");
            System.out.println("Enter your choice");
            s=d.nextInt();
            if(s==1)
            {
                System.out.println("Enter number of employees to be loaded");
                n=d.nextInt();
                for(i=0;i<n;i++)
                {
                    obj[i].load();
                }
            }
            else if(s==2)
            {
                for(i=0;i<100;i++)
                {
                    if(obj[i]==null)
                    {
                        obj[i].load();
                        break;
                    }
                }
            }
            else if(s==3)
            {
                for(i=0;i<100;i++)
                {
                    if(obj[i]!=null)
                        obj[i].display();
                    else 
                        break;
                }
            }
            else if(s==4)
            {
                System.out.println("Enter employee id");
                x=d.nextInt();
                for(i=0;i<100;i++)
                {
                    obj[i].retrieve4();
                }
            }

            else if(s==5)
            {

            }
        }while(s!=6);
    }
}
