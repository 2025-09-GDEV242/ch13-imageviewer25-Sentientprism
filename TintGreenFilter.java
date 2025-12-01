import java.awt.Color;

/**
 * An image filter to make the image a bit greener.
 * 
 * @author Michael Kölling and David J. Barnes.
 * @version 1.0
 */
public class TintGreenFilter extends Filter
{
    /**
     * Constructor for objects of class TintGreenFilter.
     * @param name The name of the filter.
     */
    public TintGreenFilter(String name)
    {
        super(name);
    }

    /**
     * Apply this filter to an image.
     * 
     * @param  image  The image to be changed by this filter.
     */
    public void apply(OFImage image)
    {
        int height = image.getHeight();
        int width = image.getWidth();
        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                Color pix = image.getPixel(x, y);
                int redValue = pix.getRed();
                int greenValue = pix.getGreen() + 75;
                if (greenValue > 255)
                {
                    greenValue = 255;
                }
                int blueValue = pix.getBlue();
                image.setPixel(x, y, new Color(redValue, greenValue, blueValue));
            }
        }
    }
}
