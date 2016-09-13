package javaLearn.JavaUtil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Created by h_kang on 2016/9/12.
 */
public class CollectionUtil {
    public static void main(String args[]) {
        CollectionUtil t = new CollectionUtil();
        t.ManipulateSet();
    }

    /**
     * 操纵列表
     */
    public void ManipulateList()
    {
        List<String> list =new ArrayList<String>();
        Collection<String> subList = new ArrayList<String>();
        list.add("Hi");
        subList.add("good");
        subList.add("-bye");
        list.addAll(subList);
        list.addAll(0,subList);
        List<String> splitList = list.subList(2,3);
        System.out.print("被截取的数据"+splitList);
        System.out.println("hi的index"+list.indexOf("Hi"));
        String[] result1= list.toArray(new String[]{});
        Object[] result2 = list.toArray();
        System.out.print( list.contains("Hi")?"包含Hi":"不包含Hi");
        System.out.println(list);
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+"、");
        }
        list.removeAll(subList);
        list.remove("good");
        System.out.println("集合操作后是否为空"+list.isEmpty());
       // list.remove(0);
        System.out.println(list);
    }

    /**
     * 操纵链表
     */
    public void ManipulateLinkedList()
    {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        System.out.println("初始化后的链表"+linkedList);
        linkedList.addFirst("X");
        linkedList.addLast("Y");
        System.out.println("增加头尾后的链表"+linkedList);
        System.out.println("1.element方法找到表头"+linkedList.element());
        System.out.println("1.element方法后的链表"+linkedList);
        System.out.println("1.peek方法找到表头"+linkedList.peek());
        System.out.println("1.peek方法后的链表"+linkedList);
        System.out.println("1.poll方法找到表头"+linkedList.poll());
        System.out.println("1.poll方法后的链表"+linkedList);
    }

    /**
     * 操纵且不能有重复数据set，hashset无序，treeset会根据compareto方法排序
     */
    public void ManipulateSet()
    {
        Set<String> set = new HashSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("A");
        set.add("D");
        set.add("E");
        System.out.println(set);
    }
}

