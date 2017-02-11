package com.muxter.ProxyPattern.virtual;

import java.awt.*;
import java.net.URL;

/**
 * Created by matao on 10/02/2017.
 */
public class ImageIcon implements Icon {

    private URL imageURL;
    private String name;

    public ImageIcon(URL imageURL, String name) {
        this.imageURL = imageURL;
        this.name = name;
    }

    @Override
    public int getIconWidth() {
        return 0;
    }

    @Override
    public int getIconHeight() {
        return 0;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {

    }
}
