package lamdas.thread.project.filter;

public interface Filter<T> {
    public boolean Test(T t);


    default public void fest(){
        System.out.println("i do nothing here");
    }
}
