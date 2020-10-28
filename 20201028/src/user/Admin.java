package user;

import operation.*;

import java.util.Scanner;

public class Admin extends User{
    public Admin(String name){
        super(name);
        this.iOperations =new IOperation[] {
                new ExitOperation(),
                new FindOperation(),
                new AddOperation(),
                new DelOperation(),
                new DisplayOperation(),

        };
    }

    @Override
    public int menu() {
        System.out.println("hello，管理员"+ this.name + "，欢迎使用图书管理系统");
        System.out.println("1、查找图书");
        System.out.println("2、新增图书");
        System.out.println("3、删除图书");
        System.out.println("4、显示所有图书图书");
        System.out.println("0、退出系统");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        return a;
    }
}
