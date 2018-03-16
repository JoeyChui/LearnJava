
public class LinkedList {

    private class Data {
        private Object obj;
        private Data next = null;

        Data(Object obj) {
            this.obj = obj;
        }
    }

    private Data first = null;

    public void insertFirst(Object obj) {
        Data data = new Data(obj);
        data.next = first;
        first = data;
    }

}
