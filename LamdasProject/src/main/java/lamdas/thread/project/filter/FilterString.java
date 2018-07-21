package lamdas.thread.project.filter;

public class FilterString implements Filter<String>{
    @Override
    public boolean Test(String s) {
        if(s.length() < 5){
            return true;
        }
        else
        {
            return false;
        }
    }
}
