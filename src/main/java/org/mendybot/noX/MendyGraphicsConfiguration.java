package org.mendybot.noX;

import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.image.ColorModel;

public class MendyGraphicsConfiguration extends GraphicsConfiguration
{
  private MendyGraphicsDevice device;
  private Rectangle bounds = new Rectangle();
  private AffineTransform tf = new AffineTransform();

  public MendyGraphicsConfiguration(MendyGraphicsDevice device)
  {
    this.device = device;
  }

  @Override
  public GraphicsDevice getDevice()
  {
    return device;
  }

  @Override
  public ColorModel getColorModel()
  {
    throw new RuntimeException("not implemented yet");
  }

  @Override
  public ColorModel getColorModel(int transparency)
  {
    throw new RuntimeException("not implemented yet");
  }

  @Override
  public AffineTransform getDefaultTransform()
  {
    return tf;
  }

  @Override
  public AffineTransform getNormalizingTransform()
  {
    throw new RuntimeException("not implemented yet");
  }

  @Override
  public Rectangle getBounds()
  {
    return bounds;
  }

}
