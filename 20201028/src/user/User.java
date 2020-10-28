package user;

import operation.IOperation;

abstract public class User {
    protected String name;


    protected IOperation[] iOperations;

    public User(String name){
        this.name = name;
    }
    public abstract int menu();

    public IOperation doOperation(int ch){
        return this.iOperations[ch];
    }
}
