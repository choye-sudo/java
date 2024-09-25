package custom;

public class CustomArrayList<T> implements CustomList{
    private Object[] arr;
    private int size;

    public CustomArrayList() {
        this.arr = new Object[0];
        this.size = 0;
    }

    public void add(Object item){
        this.size++;
        Object[] tmp = new Object [this.size];
        for(int i = 0; i<this.arr.length; i++) tmp[i] = this.arr[i];
        tmp[this.size-1] = item;
        this.arr = tmp;
    }

    public int size(){
        return this.size;
    }

    public void remove(int index){
        this.size--;
        Object[] tmp = new Object[this.size];
        int tmpIdx = 0;
        for(int i = 0; i<this.arr.length; i++){
            if(i!=index){
                tmp[tmpIdx] = this.arr[i];
                tmpIdx++;
            }
        }
        this.arr = tmp;
    }

    public void remove(Object item){
        this.size--;
        Object[] tmp = new Object[this.size];
        int tmpIdx = 0;
        for(int i = 0; i<this.arr.length; i++){
            if(!item.equals(this.arr[i])){
                tmp[tmpIdx] = this.arr[i];
                tmpIdx++;
            }
        }
        this.arr = tmp;
    }

    public Object get(int index){
        for(int i = 0; i<this.arr.length; i++){
            if(i==index) return this.arr[i];
        }
        return null;
    }

    public Object get(Object item){
        for(Object o:this.arr){
            if(o.equals(item)) return o;
        }
        return null;
    }
}
