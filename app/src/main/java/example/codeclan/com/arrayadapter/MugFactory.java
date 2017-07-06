package example.codeclan.com.arrayadapter;

import android.graphics.drawable.Drawable;

import java.util.ArrayList;

/**
 * Created by user on 05/07/2017.
 */

public class MugFactory
{
    private ArrayList<Mug> mugList;

    public MugFactory()
    {
        mugList = new ArrayList<Mug>();
        mugList.add(new Mug(true, "World's best vile ceramic cesspit.", 5, R.drawable.mug1));
        mugList.add(new Mug(true, "World's best hideous tarpit.", 4, R.drawable.mug2));
        mugList.add(new Mug(false, "Ooh shiny.", 10, R.drawable.mug3));
        mugList.add(new Mug(true, "Egads.", 1, R.drawable.mug4));
        mugList.add(new Mug(false, "Ally would be proud.", 8, R.drawable.mug5));
        mugList.add(new Mug(true, "Wasn't me.", 6, R.drawable.mug6));
        mugList.add(new Mug(true, "I've heard of sinks, but thought they were mainly Belgian contraptions.", 3, R.drawable.mug7));
        mugList.add(new Mug(true, "Bwurk.", 8, R.drawable.mug8));
        mugList.add(new Mug(false, "*tiiiing!*", 5, R.drawable.mug9));
        mugList.add(new Mug(true, "Main sticky.", 2, R.drawable.mug10));
    }

    public ArrayList<Mug> getMugList()
    {
        return new ArrayList<Mug>(mugList);
    }
}
