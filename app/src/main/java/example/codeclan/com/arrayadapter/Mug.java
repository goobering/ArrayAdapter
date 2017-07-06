package example.codeclan.com.arrayadapter;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.PaintDrawable;

/**
 * Created by user on 05/07/2017.
 */

public class Mug
{
    private boolean isFilthy;
    private String logoText;
    private int capacity;
    private int image;

    public Mug(boolean isFilthy, String logoText, int capacity, int image)
    {
        this.isFilthy = isFilthy;
        this.logoText = logoText;
        this.capacity = capacity;
        this.image = image;
    }

    public boolean isFilthy()
    {
        return isFilthy;
    }

    public String getLogoText()
    {
        return logoText;
    }

    public int getCapacity()
    {
        return capacity;
    }

    public int getImage()
    {
        return image;
    }
}
