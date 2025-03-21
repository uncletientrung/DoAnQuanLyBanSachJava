/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author DELL
 */
public class WorkFrame extends JFrame{
    public WorkFrame(){
        this.init();
        this.setVisible(true);
    }
    public void init(){
        setTitle("Quản lý bán sách");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
       // Main panel
        JPanel mainPanel = new JPanel(new BorderLayout());

        // Sidebar panel
        JPanel sidebar = new JPanel();
        sidebar.setLayout(new BoxLayout(sidebar, BoxLayout.Y_AXIS)); // Sử dụng BoxLayout để sắp xếp theo chiều dọc
        sidebar.setPreferredSize(new Dimension(250, getHeight()));
        sidebar.setBackground(new Color(230, 240, 250));

        // Panel chứa avatar và thông tin người dùng
        JPanel userInfoPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10)); // Sử dụng FlowLayout để căn trái
        userInfoPanel.setBackground(new Color(230, 240, 250)); // Màu nền giống sidebar

        // Avatar
        JLabel avatarLabel = new JLabel(new ImageIcon("avatar-default-icon.png")); // Thay thế bằng đường dẫn hình ảnh thực tế
        avatarLabel.setPreferredSize(new Dimension(60, 60)); // Đặt kích thước cho avatar

        // Panel chứa tên và vai trò
        JPanel textPanel = new JPanel();
        textPanel.setLayout(new BoxLayout(textPanel, BoxLayout.Y_AXIS)); // Sắp xếp theo chiều dọc
        textPanel.setBackground(new Color(230, 240, 250)); // Màu nền giống sidebar

        // Tên và vai trò
        JLabel nameLabel = new JLabel("Nhân viên");
        nameLabel.setFont(new Font("Arial", Font.BOLD, 14)); // Đặt font chữ
        JLabel roleLabel = new JLabel("Quản lý kho");
        roleLabel.setFont(new Font("Arial", Font.PLAIN, 12)); // Đặt font chữ

        // Thêm tên và vai trò vào textPanel
        textPanel.add(nameLabel);
        textPanel.add(roleLabel);

        // Thêm avatar và textPanel vào userInfoPanel
        userInfoPanel.add(avatarLabel);
        userInfoPanel.add(textPanel);

        // Thêm userInfoPanel vào sidebar
        sidebar.add(Box.createVerticalStrut(20)); // Khoảng cách phía trên
        sidebar.add(userInfoPanel);
        sidebar.add(Box.createVerticalStrut(20)); // Khoảng cách giữa thông tin người dùng và menu

        // Menu items (viết từng mục riêng lẻ)
        JButton btnTrangChu = createMenuButton("Trang chủ");
        JButton btnSach = createMenuButton("Sách");
        JButton btnPhieuXuat = createMenuButton("Phiếu xuất");
        JButton btnPhieuNhap = createMenuButton("Phiếu nhập");
        JButton btnKhachHang = createMenuButton("Khách hàng");
        JButton btnNhanVien = createMenuButton("Nhân viên");
        JButton btnThongTinChung = createMenuButton("Thông tin chung");
        JButton btnTaiKhoan = createMenuButton("Tài khoản");
        JButton btnThongKe = createMenuButton("Thống kê");
        JButton btnPhanQuyen = createMenuButton("Phân quyền");
        JButton btnKhuyenMai = createMenuButton("Khuyến mãi");

        // Thêm các nút vào sidebar
        sidebar.add(btnTrangChu);
        sidebar.add(Box.createVerticalStrut(5)); // Khoảng cách giữa các nút
        sidebar.add(btnSach);
        sidebar.add(Box.createVerticalStrut(5));
        sidebar.add(btnPhieuXuat);
        sidebar.add(Box.createVerticalStrut(5));
        sidebar.add(btnPhieuNhap);
        sidebar.add(Box.createVerticalStrut(5));
        sidebar.add(btnKhachHang);
        sidebar.add(Box.createVerticalStrut(5));
        sidebar.add(btnNhanVien);
        sidebar.add(Box.createVerticalStrut(5));
        sidebar.add(btnThongTinChung);
        sidebar.add(Box.createVerticalStrut(5));
        sidebar.add(btnTaiKhoan);
        sidebar.add(Box.createVerticalStrut(5));
        sidebar.add(btnThongKe);
        sidebar.add(Box.createVerticalStrut(5));
        sidebar.add(btnPhanQuyen);
        sidebar.add(Box.createVerticalStrut(5));
        sidebar.add(btnKhuyenMai);

        // Tạo panel cho phần Center với background là hình ảnh
        JPanel centerPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Load hình ảnh từ đường dẫn
                ImageIcon imageIcon = new ImageIcon("background.png"); // Thay thế bằng đường dẫn hình ảnh thực tế
                Image image = imageIcon.getImage();
                // Vẽ hình ảnh lên panel
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        centerPanel.setLayout(new BorderLayout()); // Sử dụng BorderLayout cho centerPanel

        // Adding sidebar và centerPanel vào main panel
        mainPanel.add(sidebar, BorderLayout.WEST);
        mainPanel.add(centerPanel, BorderLayout.CENTER);

        // Adding main panel to frame
        add(mainPanel);
    }

    // Phương thức tạo nút menu với kích thước và căn chỉnh phù hợp
    private JButton createMenuButton(String text) {
        JButton button = new JButton(text);
        button.setAlignmentX(Component.CENTER_ALIGNMENT); // Căn giữa các nút
        button.setPreferredSize(new Dimension(200, 50)); // Đặt kích thước ưu tiên: rộng 200px, cao 50px
        button.setMaximumSize(new Dimension(Integer.MAX_VALUE, 50)); // Đặt chiều cao tối đa là 50px
        button.setFont(new Font("Arial", Font.PLAIN, 14)); // Đặt font chữ
        button.setBackground(new Color(240, 240, 240)); // Màu nền nhẹ
        button.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20)); // Padding cho nút
        return button;
    }
}

