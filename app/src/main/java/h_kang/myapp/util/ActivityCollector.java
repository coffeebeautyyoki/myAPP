package h_kang.myapp.util;

import android.app.*;
import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by h_kang on 2016/9/5.
 */
///该类用来清空activity栈
public class ActivityCollector {
    public static List<Activity> Activities = new ArrayList<Activity>();

    public static void addActivity(Activity a)
    {
        Activities.add(a);
    }

    public static void removeActivity(Activity a)
    {
        Activities.remove(a);
    }

    public static void finishAll()
    {
        for(Activity a:Activities)
        {
            if(!a.isFinishing())
            a.finish();
        }
    }
}
