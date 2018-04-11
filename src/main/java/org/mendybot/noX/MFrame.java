package org.mendybot.noX;

import java.awt.AWTEvent;
import java.awt.AWTException;
import java.awt.BufferCapabilities;
import java.awt.BufferCapabilities.FlipContents;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GraphicsConfiguration;
import java.awt.Image;
import java.awt.Insets;
import java.awt.MenuBar;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.PaintEvent;
import java.awt.image.ColorModel;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.awt.image.VolatileImage;
import java.awt.peer.ComponentPeer;
import java.awt.peer.ContainerPeer;
import java.awt.peer.FramePeer;

import sun.awt.CausedFocusEvent.Cause;
import sun.java2d.pipe.Region;

public class MFrame implements FramePeer
{
  private Frame target;
  private Rectangle maximized;
  private Insets insets = new Insets(1,1,1,1); // t l b r

  public MFrame(Frame target)
  {
    this.target = target;
  }

  @Override
  public void toFront()
  {
    System.out.println("to front");
  }

  @Override
  public void toBack()
  {
    throw new RuntimeException("not implemented yet");
  }

  @Override
  public void updateAlwaysOnTopState()
  {
    throw new RuntimeException("not implemented yet");
  }

  @Override
  public void updateFocusableWindowState()
  {
    Component[] cList = target.getComponents();
    for (Component c : cList) {
    }
    System.out.println("updateFocusableWindowState");
  }

  @Override
  public void setModalBlocked(Dialog blocker, boolean blocked)
  {
    throw new RuntimeException("not implemented yet");
  }

  @Override
  public void updateMinimumSize()
  {
    throw new RuntimeException("not implemented yet");
  }

  @Override
  public void updateIconImages()
  {
    throw new RuntimeException("not implemented yet");
  }

  @Override
  public void setOpacity(float opacity)
  {
    throw new RuntimeException("not implemented yet");
  }

  @Override
  public void setOpaque(boolean isOpaque)
  {
    throw new RuntimeException("not implemented yet");
  }

  @Override
  public void updateWindow()
  {
    throw new RuntimeException("not implemented yet");
  }

  @Override
  public void repositionSecurityWarning()
  {
    throw new RuntimeException("not implemented yet");
  }

  @Override
  public Insets getInsets()
  {
    return insets;
  }

  @Override
  public void beginValidate()
  {
    System.out.println("begin validate");
    Component[] cList = target.getComponents();
    for (Component c : cList) {
      c.validate();
//      System.out.println(c.toString());
    }
  }

  @Override
  public void endValidate()
  {
    System.out.println("end validate");
  }

  @Override
  public void beginLayout()
  {
    System.out.println("begin layout");
    Component[] cList = target.getComponents();
    for (Component c : cList) {
      c.doLayout();
//      System.out.println(c.toString());
    }
  }

  @Override
  public void endLayout()
  {
    System.out.println("end layout");
  }

  @Override
  public boolean isObscured()
  {
        throw new RuntimeException("not implemented yet");
    
  }

  @Override
  public boolean canDetermineObscurity()
  {
        throw new RuntimeException("not implemented yet");
    
  }

  @Override
  public void setVisible(boolean v)
  {
    this.target.setVisible(v);
  }

  @Override
  public void setEnabled(boolean e)
  {
        throw new RuntimeException("not implemented yet");

  }

  @Override
  public void paint(Graphics g)
  {
        throw new RuntimeException("not implemented yet");

  }

  @Override
  public void print(Graphics g)
  {
        throw new RuntimeException("not implemented yet");

  }

  @Override
  public void setBounds(int x, int y, int width, int height, int op)
  {
        throw new RuntimeException("not implemented yet");

  }

  @Override
  public void handleEvent(AWTEvent e)
  {
    System.out.println("got event: "+e);
  }

  @Override
  public void coalescePaintEvent(PaintEvent e)
  {
        throw new RuntimeException("not implemented yet");

  }

  @Override
  public Point getLocationOnScreen()
  {
        throw new RuntimeException("not implemented yet");
    
  }

  @Override
  public Dimension getPreferredSize()
  {
        throw new RuntimeException("not implemented yet");
    
  }

  @Override
  public Dimension getMinimumSize()
  {
        throw new RuntimeException("not implemented yet");
    
  }

  @Override
  public ColorModel getColorModel()
  {
        throw new RuntimeException("not implemented yet");
    
  }

  @Override
  public Graphics getGraphics()
  {
        throw new RuntimeException("not implemented yet");
    
  }

  @Override
  public FontMetrics getFontMetrics(Font font)
  {
        throw new RuntimeException("not implemented yet");
    
  }

  @Override
  public void dispose()
  {
        throw new RuntimeException("not implemented yet");

  }

  @Override
  public void setForeground(Color c)
  {
        throw new RuntimeException("not implemented yet");

  }

  @Override
  public void setBackground(Color c)
  {
        throw new RuntimeException("not implemented yet");

  }

  @Override
  public void setFont(Font f)
  {
        throw new RuntimeException("not implemented yet");

  }

  @Override
  public void updateCursorImmediately()
  {
    System.out.println("update cursor right now");
  }

  @Override
  public boolean requestFocus(Component lightweightChild, boolean temporary, boolean focusedWindowChangeAllowed,
      long time, Cause cause)
  {
        throw new RuntimeException("not implemented yet");
    
  }

  @Override
  public boolean isFocusable()
  {
        throw new RuntimeException("not implemented yet");
    
  }

  @Override
  public Image createImage(ImageProducer producer)
  {
        throw new RuntimeException("not implemented yet");
    
  }

  @Override
  public Image createImage(int width, int height)
  {
        throw new RuntimeException("not implemented yet");
    
  }

  @Override
  public VolatileImage createVolatileImage(int width, int height)
  {
        throw new RuntimeException("not implemented yet");
    
  }

  @Override
  public boolean prepareImage(Image img, int w, int h, ImageObserver o)
  {
        throw new RuntimeException("not implemented yet");
    
  }

  @Override
  public int checkImage(Image img, int w, int h, ImageObserver o)
  {
        throw new RuntimeException("not implemented yet");
    
  }

  @Override
  public GraphicsConfiguration getGraphicsConfiguration()
  {
        throw new RuntimeException("not implemented yet");
    
  }

  @Override
  public boolean handlesWheelScrolling()
  {
        throw new RuntimeException("not implemented yet");
    
  }

  @Override
  public void createBuffers(int numBuffers, BufferCapabilities caps) throws AWTException
  {
        throw new RuntimeException("not implemented yet");

  }

  @Override
  public Image getBackBuffer()
  {
        throw new RuntimeException("not implemented yet");
    
  }

  @Override
  public void flip(int x1, int y1, int x2, int y2, FlipContents flipAction)
  {
        throw new RuntimeException("not implemented yet");

  }

  @Override
  public void destroyBuffers()
  {
        throw new RuntimeException("not implemented yet");

  }

  @Override
  public void reparent(ContainerPeer newContainer)
  {
        throw new RuntimeException("not implemented yet");

  }

  @Override
  public boolean isReparentSupported()
  {
        throw new RuntimeException("not implemented yet");
    
  }

  @Override
  public void layout()
  {
    target.doLayout();
  }

  @Override
  public void applyShape(Region shape)
  {
        throw new RuntimeException("not implemented yet");

  }

  @Override
  public void setZOrder(ComponentPeer above)
  {
        throw new RuntimeException("not implemented yet");

  }

  @Override
  public boolean updateGraphicsData(GraphicsConfiguration gc)
  {
        throw new RuntimeException("not implemented yet");
    
  }

  @Override
  public void setTitle(String title)
  {
        throw new RuntimeException("not implemented yet");

  }

  @Override
  public void setMenuBar(MenuBar mb)
  {
        throw new RuntimeException("not implemented yet");

  }

  @Override
  public void setResizable(boolean resizeable)
  {
        throw new RuntimeException("not implemented yet");

  }

  @Override
  public void setState(int state)
  {
        throw new RuntimeException("not implemented yet");

  }

  @Override
  public int getState()
  {
        throw new RuntimeException("not implemented yet");
    
  }

  @Override
  public void setMaximizedBounds(Rectangle bounds)
  {
    maximized = bounds;
  }

  @Override
  public void setBoundsPrivate(int x, int y, int width, int height)
  {
        throw new RuntimeException("not implemented yet");

  }

  @Override
  public Rectangle getBoundsPrivate()
  {
        throw new RuntimeException("not implemented yet");
    
  }

  @Override
  public void emulateActivation(boolean activate)
  {
        throw new RuntimeException("not implemented yet");

  }

}
