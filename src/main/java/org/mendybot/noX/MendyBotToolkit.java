package org.mendybot.noX;

import java.awt.Button;
import java.awt.Canvas;
import java.awt.Checkbox;
import java.awt.CheckboxMenuItem;
import java.awt.Choice;
import java.awt.Desktop;
import java.awt.Dialog;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Dialog.ModalityType;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Label;
import java.awt.List;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.PopupMenu;
import java.awt.PrintJob;
import java.awt.ScrollPane;
import java.awt.Scrollbar;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.datatransfer.Clipboard;
import java.awt.dnd.DragGestureEvent;
import java.awt.dnd.InvalidDnDOperationException;
import java.awt.dnd.peer.DragSourceContextPeer;
import java.awt.font.TextAttribute;
import java.awt.im.InputMethodHighlight;
import java.awt.image.ColorModel;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.awt.peer.ButtonPeer;
import java.awt.peer.CanvasPeer;
import java.awt.peer.CheckboxMenuItemPeer;
import java.awt.peer.CheckboxPeer;
import java.awt.peer.ChoicePeer;
import java.awt.peer.DesktopPeer;
import java.awt.peer.DialogPeer;
import java.awt.peer.FileDialogPeer;
import java.awt.peer.FontPeer;
import java.awt.peer.FramePeer;
import java.awt.peer.KeyboardFocusManagerPeer;
import java.awt.peer.LabelPeer;
import java.awt.peer.ListPeer;
import java.awt.peer.MenuBarPeer;
import java.awt.peer.MenuItemPeer;
import java.awt.peer.MenuPeer;
import java.awt.peer.PanelPeer;
import java.awt.peer.PopupMenuPeer;
import java.awt.peer.ScrollPanePeer;
import java.awt.peer.ScrollbarPeer;
import java.awt.peer.TextAreaPeer;
import java.awt.peer.TextFieldPeer;
import java.awt.peer.WindowPeer;
import java.net.URL;
import java.util.Map;
import java.util.Properties;

import sun.awt.KeyboardFocusManagerPeerProvider;

public class MendyBotToolkit extends Toolkit implements KeyboardFocusManagerPeerProvider
{
  private KeyboardFocusManagerPeer keyboardPeer = new MendyKeyboardFocusManager();
  private EventQueue eventQueue = new EventQueue(); 

  @Override
  protected DesktopPeer createDesktopPeer(Desktop target) throws HeadlessException
  {
    throw new RuntimeException("not implemented yet");
  }

  @Override
  protected ButtonPeer createButton(Button target) throws HeadlessException
  {
    throw new RuntimeException("not implemented yet");
  }

  @Override
  protected TextFieldPeer createTextField(TextField target) throws HeadlessException
  {
    throw new RuntimeException("not implemented yet");
  }

  @Override
  protected LabelPeer createLabel(Label target) throws HeadlessException
  {
    throw new RuntimeException("not implemented yet");
  }

  @Override
  protected ListPeer createList(List target) throws HeadlessException
  {
    throw new RuntimeException("not implemented yet");
  }

  @Override
  protected CheckboxPeer createCheckbox(Checkbox target) throws HeadlessException
  {
    throw new RuntimeException("not implemented yet");
  }

  @Override
  protected ScrollbarPeer createScrollbar(Scrollbar target) throws HeadlessException
  {
    throw new RuntimeException("not implemented yet");
  }

  @Override
  protected ScrollPanePeer createScrollPane(ScrollPane target) throws HeadlessException
  {
    throw new RuntimeException("not implemented yet");
  }

  @Override
  protected TextAreaPeer createTextArea(TextArea target) throws HeadlessException
  {
    throw new RuntimeException("not implemented yet");
  }

  @Override
  protected ChoicePeer createChoice(Choice target) throws HeadlessException
  {
    throw new RuntimeException("not implemented yet");
  }

  @Override
  protected FramePeer createFrame(Frame target) throws HeadlessException
  {
    return new MFrame(target);
  }

  @Override
  protected CanvasPeer createCanvas(Canvas target)
  {
    throw new RuntimeException("not implemented yet");
  }

  @Override
  protected PanelPeer createPanel(Panel target)
  {
    throw new RuntimeException("not implemented yet");
  }

  @Override
  protected WindowPeer createWindow(Window target) throws HeadlessException
  {
    throw new RuntimeException("not implemented yet");
  }

  @Override
  protected DialogPeer createDialog(Dialog target) throws HeadlessException
  {
    throw new RuntimeException("not implemented yet");
  }

  @Override
  protected MenuBarPeer createMenuBar(MenuBar target) throws HeadlessException
  {
    throw new RuntimeException("not implemented yet");
  }

  @Override
  protected MenuPeer createMenu(Menu target) throws HeadlessException
  {
    throw new RuntimeException("not implemented yet");
  }

  @Override
  protected PopupMenuPeer createPopupMenu(PopupMenu target) throws HeadlessException
  {
    throw new RuntimeException("not implemented yet");
  }

  @Override
  protected MenuItemPeer createMenuItem(MenuItem target) throws HeadlessException
  {
    throw new RuntimeException("not implemented yet");
  }

  @Override
  protected FileDialogPeer createFileDialog(FileDialog target) throws HeadlessException
  {
    throw new RuntimeException("not implemented yet");
  }

  @Override
  protected CheckboxMenuItemPeer createCheckboxMenuItem(CheckboxMenuItem target) throws HeadlessException
  {
    throw new RuntimeException("not implemented yet");
  }

  @Override
  protected FontPeer getFontPeer(String name, int style)
  {
    throw new RuntimeException("not implemented yet");
  }

  @Override
  public Dimension getScreenSize() throws HeadlessException
  {
    throw new RuntimeException("not implemented yet");
  }

  @Override
  public int getScreenResolution() throws HeadlessException
  {
    throw new RuntimeException("not implemented yet");
  }

  @Override
  public ColorModel getColorModel() throws HeadlessException
  {
    throw new RuntimeException("not implemented yet");
  }

  @Override
  public String[] getFontList()
  {
    throw new RuntimeException("not implemented yet");
  }

  @Override
  public FontMetrics getFontMetrics(Font font)
  {
    throw new RuntimeException("not implemented yet");
  }

  @Override
  public void sync()
  {
    throw new RuntimeException("not implemented yet");
  }

  @Override
  public Image getImage(String filename)
  {
    throw new RuntimeException("not implemented yet");
  }

  @Override
  public Image getImage(URL url)
  {
    throw new RuntimeException("not implemented yet");
  }

  @Override
  public Image createImage(String filename)
  {
    throw new RuntimeException("not implemented yet");
  }

  @Override
  public Image createImage(URL url)
  {
    throw new RuntimeException("not implemented yet");
  }

  @Override
  public boolean prepareImage(Image image, int width, int height, ImageObserver observer)
  {
    throw new RuntimeException("not implemented yet");
  }

  @Override
  public int checkImage(Image image, int width, int height, ImageObserver observer)
  {
    throw new RuntimeException("not implemented yet");
  }

  @Override
  public Image createImage(ImageProducer producer)
  {
    throw new RuntimeException("not implemented yet");
  }

  @Override
  public Image createImage(byte[] imagedata, int imageoffset, int imagelength)
  {
    throw new RuntimeException("not implemented yet");
  }

  @Override
  public PrintJob getPrintJob(Frame frame, String jobtitle, Properties props)
  {
    throw new RuntimeException("not implemented yet");
  }

  @Override
  public void beep()
  {
    throw new RuntimeException("not implemented yet");
  }

  @Override
  public Clipboard getSystemClipboard() throws HeadlessException
  {
    throw new RuntimeException("not implemented yet");
  }

  @Override
  protected EventQueue getSystemEventQueueImpl()
  {
    return eventQueue;
  }

  @Override
  public DragSourceContextPeer createDragSourceContextPeer(DragGestureEvent dge) throws InvalidDnDOperationException
  {
    throw new RuntimeException("not implemented yet");
  }

  @Override
  public boolean isModalityTypeSupported(ModalityType modalityType)
  {
    throw new RuntimeException("not implemented yet");
  }

  @Override
  public boolean isModalExclusionTypeSupported(ModalExclusionType modalExclusionType)
  {
    throw new RuntimeException("not implemented yet");
  }

  @Override
  public Map<TextAttribute, ?> mapInputMethodHighlight(InputMethodHighlight highlight) throws HeadlessException
  {
    throw new RuntimeException("not implemented yet");
  }

  @Override
  public KeyboardFocusManagerPeer getKeyboardFocusManagerPeer()
  {
    return keyboardPeer;
  }

}
