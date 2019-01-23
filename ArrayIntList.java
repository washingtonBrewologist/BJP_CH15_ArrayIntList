public class ArrayIntList {
    // size will keep track of how much of the list is currently occupied
    private int size;
    private int[] elementData;

    public ArrayIntList(){
        elementData = new int[100];
        size = 0;
    }

    public void add(int value){
        // The size of the list will always match the index of the first vacant cell
        elementData[size] = value;
        // We must also increment size to include the new value
        size++;
    }

    public void add(int index, int value){
        for (int i = size; i >= index + 1; i--){
            elementData[i] = elementData[i - 1];
        }
        elementData[index] = value;
        size++;
    }

    // Allows a user to access a specified value in the array
    public int indexOf(int value){
        for (int i = 0; i < size; i++){
            if (elementData[i] == value){
                return i;
            }
        }
        return -1;
    }

    public void remove(int index){
        for (int i = index; i < size -1; i++){
            elementData[i] = elementData[i + 1];
        }
        // update size after removal
        size--;
    }

    // Allows the user to have access to the size of the list
    public int size(){
        return size;
    }

    public String toString(){
        if (size == 0){
            return "[]";
        } else {
            String result = "[" + elementData[0];
            for (int i = 1; i < size; i++){
                result+=", " + elementData[i];
            }
            result += "]";
            return result;
        }

    }
}
