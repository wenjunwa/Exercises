
public class byTwos implements SeriesSub{
    int val;
    byTwos(){
        this.val = 0;
    }

    @Override
    public int getNext() {
        if (this.val >= MAX){
            System.out.println(ERRORMSG);
            
        }else{
            this.val +=2;
            return this.val;
        }
        return this.val;
    }
    
    @Override
    public int getPrev(){
        this.val -=2;
        return this.val;
    }
    
    @Override
    public void printStuff(){
        System.out.println("I'm the ByTwos clss");
    }
    
    
}
