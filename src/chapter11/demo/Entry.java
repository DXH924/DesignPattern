package chapter11.demo;

/**
 * @author zhang chhi
 * @Title:
 * @Package:
 * @Description: 抽象类，用于实现File类和Directory类的一致性
 * @date 2021-04-11 10:18
 */
public abstract class Entry {
    public abstract String getName();
    public abstract int getSize();
    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }
    public void printList() {
        printList("");
    }
    protected abstract void printList(String prefix);
    public String toString() {
        return getName() + "(" + getSize() + ")";
    }
}