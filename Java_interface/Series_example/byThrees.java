
public class byThrees implements SeriesSub{
    int val;
    
    byThrees(){
        this.val = 0;
    }

    @Override
    public int getNext() {
        if (this.val >= MAX){
            System.out.println(ERRORMSG);
            
        }else{
            this.val +=3;
            return this.val;
        }
        return this.val;
    }  
    @Override
    public int getPrev(){
        this.val -= 3;
        return this.val;
    }
}
