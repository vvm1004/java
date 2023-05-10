/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh1;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
/**
 *
 * @author ADmin
 */


public class PhanHoi {
    
    public void FeedBack() throws URISyntaxException, IOException{
          String url = "https://forms.gle/yWZZ7YLjrjxYGbhC8"; // Thay đổi URL của trang web bạn muốn mở

    // Kiểm tra xem hệ thống có hỗ trợ Desktop hay không
    if (Desktop.isDesktopSupported()) {
      // Lấy Desktop hiện tại
      Desktop desktop = Desktop.getDesktop();
      // Kiểm tra xem URI có hợp lệ hay không
      if (desktop.isSupported(Desktop.Action.BROWSE)) {
        // Tạo đối tượng URI từ URL
        URI uri = new URI(url);
        // Mở trang web bằng trình duyệt mặc định
        desktop.browse(uri);
      }
    }
   }
   
    public static void main(String[] args) throws Exception {
        
  }
}
