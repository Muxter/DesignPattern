package com.muxter.ProxyPattern.virtual;

import java.awt.*;

/**
 * Created by matao on 10/02/2017.
 */
public interface Icon {
    int getIconWidth();

    int getIconHeight();

    void paintIcon(Component c, Graphics g, int x, int y);
}
