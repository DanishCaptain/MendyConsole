package org.mendybot.noX;

import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;

public class MendyGraphicsDevice extends GraphicsDevice
{
  private GraphicsConfiguration config = new MendyGraphicsConfiguration(this);
  private String idString = "/dev/xxx";

  @Override
  public int getType()
  {
    return TYPE_RASTER_SCREEN;
  }

  @Override
  public String getIDstring()
  {
    return idString;
  }

  @Override
  public GraphicsConfiguration[] getConfigurations()
  {
    throw new RuntimeException("not implemented yet");
  }

  @Override
  public GraphicsConfiguration getDefaultConfiguration()
  {
    return config;
  }

}
