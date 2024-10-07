package GUI;

import java.awt.Color;

/**
 * @author SonVuuu
 */
public class TrangChu extends javax.swing.JFrame {

    public TrangChu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PanelLogo = new Util.PanelRound();
        LabelCaPheSGU = new javax.swing.JLabel();
        LabelXinChao = new javax.swing.JLabel();
        LabelIcon = new javax.swing.JLabel();
        PanelCalendar = new Util.PanelRound();
        LabelCalendarIcon = new javax.swing.JLabel();
        LabelDate = new javax.swing.JLabel();
        PanelDangXuat = new Util.PanelRound();
        PanelTen = new javax.swing.JLabel();
        ButtonDangXuat = new javax.swing.JButton();
        PanelThongTin = new Util.PanelRound();
        LabelChucVu = new javax.swing.JLabel();
        LabelTen = new javax.swing.JLabel();
        LabelTitle = new javax.swing.JLabel();
        LabelThongTinIcon = new javax.swing.JLabel();
        PanelChucNang = new Util.PanelRound();
        LabelBanHang = new javax.swing.JLabel();
        LabelKhachHang = new javax.swing.JLabel();
        LabelNhapHang = new javax.swing.JLabel();
        LabelMon = new javax.swing.JLabel();
        LabelNguyenLieu = new javax.swing.JLabel();
        LabelLichLam = new javax.swing.JLabel();
        LabelKhuyenMai = new javax.swing.JLabel();
        LabelNhaCungCap = new javax.swing.JLabel();
        LabelNhanVien = new javax.swing.JLabel();
        LabelThongKe = new javax.swing.JLabel();
        PanelNoiDung = new Util.PanelRound();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(122, 74, 74));
        jPanel1.setPreferredSize(new java.awt.Dimension(1361, 763));

        PanelLogo.setBackground(new java.awt.Color(219, 189, 142));
        PanelLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PanelLogo.setPreferredSize(new java.awt.Dimension(253, 65));
        PanelLogo.setRoundBottomRight(20);
        PanelLogo.setRoundTopLeft(20);
        PanelLogo.setRoundTopRight(20);
        PanelLogo.setRoundBottomLeft(20);

        LabelCaPheSGU.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        LabelCaPheSGU.setText("Cà Phê SGU");

        LabelXinChao.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        LabelXinChao.setText("xin chào");

        LabelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Logo.png"))); // NOI18N
        LabelIcon.setText("jLabel3");

        javax.swing.GroupLayout PanelLogoLayout = new javax.swing.GroupLayout(PanelLogo);
        PanelLogo.setLayout(PanelLogoLayout);
        PanelLogoLayout.setHorizontalGroup(
            PanelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLogoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(LabelIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(PanelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLogoLayout.createSequentialGroup()
                        .addComponent(LabelXinChao)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLogoLayout.createSequentialGroup()
                        .addComponent(LabelCaPheSGU)
                        .addGap(23, 23, 23))))
        );
        PanelLogoLayout.setVerticalGroup(
            PanelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLogoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelCaPheSGU, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelXinChao)
                .addContainerGap())
            .addGroup(PanelLogoLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(LabelIcon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelCalendar.setBackground(new java.awt.Color(219, 189, 142));
        PanelCalendar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PanelCalendar.setPreferredSize(new java.awt.Dimension(309, 52));
        PanelCalendar.setRoundBottomRight(20);
        PanelCalendar.setRoundTopLeft(20);
        PanelCalendar.setRoundTopRight(20);
        PanelCalendar.setRoundBottomLeft(20);

        LabelCalendarIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Calendar.png"))); // NOI18N
        LabelCalendarIcon.setText("jLabel2");

        LabelDate.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        LabelDate.setText("Thứ Tư, 25 tháng 09 năm 2024");

        javax.swing.GroupLayout PanelCalendarLayout = new javax.swing.GroupLayout(PanelCalendar);
        PanelCalendar.setLayout(PanelCalendarLayout);
        PanelCalendarLayout.setHorizontalGroup(
            PanelCalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCalendarLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(LabelCalendarIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LabelDate)
                .addGap(12, 12, 12))
        );
        PanelCalendarLayout.setVerticalGroup(
            PanelCalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCalendarLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(PanelCalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelDate)
                    .addComponent(LabelCalendarIcon))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        PanelDangXuat.setBackground(new java.awt.Color(219, 189, 142));
        PanelDangXuat.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PanelDangXuat.setPreferredSize(new java.awt.Dimension(390, 54));
        PanelDangXuat.setRoundBottomRight(20);
        PanelDangXuat.setRoundTopLeft(20);
        PanelDangXuat.setRoundTopRight(20);
        PanelDangXuat.setRoundBottomLeft(20);

        PanelTen.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        PanelTen.setText("DƯƠNG VĂN PHƯỚC");

        ButtonDangXuat.setBackground(new java.awt.Color(239, 219, 203));
        ButtonDangXuat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ButtonDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/DangXuat.png"))); // NOI18N
        ButtonDangXuat.setText(" Đăng Xuất");
        ButtonDangXuat.setAlignmentY(0.0F);
        ButtonDangXuat.setBorder(null);
        ButtonDangXuat.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        ButtonDangXuat.setIconTextGap(10);
        ButtonDangXuat.setPreferredSize(new java.awt.Dimension(138, 28));

        javax.swing.GroupLayout PanelDangXuatLayout = new javax.swing.GroupLayout(PanelDangXuat);
        PanelDangXuat.setLayout(PanelDangXuatLayout);
        PanelDangXuatLayout.setHorizontalGroup(
            PanelDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDangXuatLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(PanelTen, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        PanelDangXuatLayout.setVerticalGroup(
            PanelDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDangXuatLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(PanelDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PanelTen)
                    .addComponent(ButtonDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        PanelThongTin.setBackground(new java.awt.Color(255, 255, 255));
        PanelThongTin.setPreferredSize(new java.awt.Dimension(172, 159));
        PanelThongTin.setRoundBottomRight(20);
        PanelThongTin.setRoundTopLeft(20);
        PanelThongTin.setRoundTopRight(20);
        PanelThongTin.setRoundBottomLeft(20);

        LabelChucVu.setFont(new java.awt.Font("Segoe UI Black", 0, 13)); // NOI18N
        LabelChucVu.setText("Quản Lý");

        LabelTen.setText("Dương Văn Phước ");

        LabelTitle.setFont(new java.awt.Font("Segoe UI Black", 0, 13)); // NOI18N
        LabelTitle.setText("Thông tin người dùng");

        LabelThongTinIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-user-80.png"))); // NOI18N

        javax.swing.GroupLayout PanelThongTinLayout = new javax.swing.GroupLayout(PanelThongTin);
        PanelThongTin.setLayout(PanelThongTinLayout);
        PanelThongTinLayout.setHorizontalGroup(
            PanelThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelThongTinLayout.createSequentialGroup()
                .addGroup(PanelThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelThongTinLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(LabelTen))
                    .addGroup(PanelThongTinLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(LabelTitle))
                    .addGroup(PanelThongTinLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(LabelThongTinIcon))
                    .addGroup(PanelThongTinLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(LabelChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        PanelThongTinLayout.setVerticalGroup(
            PanelThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelThongTinLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(LabelTitle)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LabelThongTinIcon)
                .addGap(8, 8, 8)
                .addComponent(LabelTen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelChucVu)
                .addGap(10, 10, 10))
        );

        PanelChucNang.setBackground(new java.awt.Color(255, 255, 255));
        PanelChucNang.setPreferredSize(new java.awt.Dimension(173, 463));
        PanelChucNang.setRoundBottomRight(20);
        PanelChucNang.setRoundTopLeft(20);
        PanelChucNang.setRoundTopRight(20);
        PanelChucNang.setRoundBottomLeft(20);
        

        LabelBanHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-cart-25.png"))); // NOI18N
        LabelBanHang.setText("Bán Hàng");
        LabelBanHang.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        LabelBanHang.setIconTextGap(15);

        LabelKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-customer-25.png"))); // NOI18N
        LabelKhachHang.setText("Khách Hàng");
        LabelKhachHang.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        LabelKhachHang.setIconTextGap(15);

        LabelNhapHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-exchange-25.png"))); // NOI18N
        LabelNhapHang.setText("Nhập Hàng");
        LabelNhapHang.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        LabelNhapHang.setIconTextGap(15);

        LabelMon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-coffee-25.png"))); // NOI18N
        LabelMon.setText("Món");
        LabelMon.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        LabelMon.setIconTextGap(15);

        LabelNguyenLieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-coffee-bag-25.png"))); // NOI18N
        LabelNguyenLieu.setText("Nguyên Liệu");
        LabelNguyenLieu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        LabelNguyenLieu.setIconTextGap(15);

        LabelLichLam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-schedule-25.png"))); // NOI18N
        LabelLichLam.setText("Lịch Làm");
        LabelLichLam.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        LabelLichLam.setIconTextGap(15);

        LabelKhuyenMai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-discount-25.png"))); // NOI18N
        LabelKhuyenMai.setText("Khuyến Mãi-Ưu Đãi");
        LabelKhuyenMai.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        LabelKhuyenMai.setIconTextGap(15);

        LabelNhaCungCap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-factory-25.png"))); // NOI18N
        LabelNhaCungCap.setText("Nhà Cung Cấp");
        LabelNhaCungCap.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        LabelNhaCungCap.setIconTextGap(15);

        LabelNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-employee-25.png"))); // NOI18N
        LabelNhanVien.setText("Nhân Viên");
        LabelNhanVien.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        LabelNhanVien.setIconTextGap(15);

        LabelThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-graph-25.png"))); // NOI18N
        LabelThongKe.setText("Thống Kê");
        LabelThongKe.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        LabelThongKe.setIconTextGap(15);

        javax.swing.GroupLayout PanelChucNangLayout = new javax.swing.GroupLayout(PanelChucNang);
        PanelChucNang.setLayout(PanelChucNangLayout);
        PanelChucNangLayout.setHorizontalGroup(
            PanelChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelBanHang, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(LabelKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(LabelNhapHang, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(LabelMon, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(LabelNguyenLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(LabelLichLam, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(LabelKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(LabelNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(LabelNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(LabelThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        PanelChucNangLayout.setVerticalGroup(
            PanelChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelChucNangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelBanHang, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(LabelKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(LabelNhapHang, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(LabelMon, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(LabelNguyenLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(LabelLichLam, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(LabelKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(LabelNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(LabelNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(LabelThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addContainerGap())
        );

        LabelBanHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LabelBanHang.setOpaque(true); // Đảm bảo JLabel hiển thị màu nền
                LabelBanHang.setBackground(new Color(237, 237, 237));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                LabelBanHang.setOpaque(true); // Đảm bảo JLabel hiển thị màu nền
                LabelBanHang.setBackground(Color.white);
            }
        });
        LabelKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LabelKhachHang.setOpaque(true); // Đảm bảo JLabel hiển thị màu nền
                LabelKhachHang.setBackground(new Color(237, 237, 237));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                LabelKhachHang.setOpaque(true); // Đảm bảo JLabel hiển thị màu nền
                LabelKhachHang.setBackground(Color.white);
            }
        });
        LabelNhapHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LabelNhapHang.setOpaque(true); // Đảm bảo JLabel hiển thị màu nền
                LabelNhapHang.setBackground(new Color(237, 237, 237));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                LabelNhapHang.setOpaque(true); // Đảm bảo JLabel hiển thị màu nền
                LabelNhapHang.setBackground(Color.white);
            }
        });
        LabelMon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LabelMon.setOpaque(true); // Đảm bảo JLabel hiển thị màu nền
                LabelMon.setBackground(new Color(237, 237, 237));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                LabelMon.setOpaque(true); // Đảm bảo JLabel hiển thị màu nền
                LabelMon.setBackground(Color.white);
            }
        });
        LabelNguyenLieu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LabelNguyenLieu.setOpaque(true); // Đảm bảo JLabel hiển thị màu nền
                LabelNguyenLieu.setBackground(new Color(237, 237, 237));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                LabelNguyenLieu.setOpaque(true); // Đảm bảo JLabel hiển thị màu nền
                LabelNguyenLieu.setBackground(Color.white);
            }
        });
        LabelLichLam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LabelLichLam.setOpaque(true); // Đảm bảo JLabel hiển thị màu nền
                LabelLichLam.setBackground(new Color(237, 237, 237));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                LabelLichLam.setOpaque(true); // Đảm bảo JLabel hiển thị màu nền
                LabelLichLam.setBackground(Color.white);
            }
        });
        LabelKhuyenMai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LabelKhuyenMai.setOpaque(true); // Đảm bảo JLabel hiển thị màu nền
                LabelKhuyenMai.setBackground(new Color(237, 237, 237));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                LabelKhuyenMai.setOpaque(true); // Đảm bảo JLabel hiển thị màu nền
                LabelKhuyenMai.setBackground(Color.white);
            }
        });
        LabelNhaCungCap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LabelNhaCungCap.setOpaque(true); // Đảm bảo JLabel hiển thị màu nền
                LabelNhaCungCap.setBackground(new Color(237, 237, 237));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                LabelNhaCungCap.setOpaque(true); // Đảm bảo JLabel hiển thị màu nền
                LabelNhaCungCap.setBackground(Color.white);
            }
        });
        LabelNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LabelNhanVien.setOpaque(true); // Đảm bảo JLabel hiển thị màu nền
                LabelNhanVien.setBackground(new Color(237, 237, 237));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                LabelNhanVien.setOpaque(true); // Đảm bảo JLabel hiển thị màu nền
                LabelNhanVien.setBackground(Color.white);
            }
        });
        LabelThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LabelThongKe.setOpaque(true); // Đảm bảo JLabel hiển thị màu nền
                LabelThongKe.setBackground(new Color(237, 237, 237));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                LabelThongKe.setOpaque(true); // Đảm bảo JLabel hiển thị màu nền
                LabelThongKe.setBackground(Color.white);
            }
        });

        PanelNoiDung.setBackground(new java.awt.Color(255, 255, 255));
        PanelNoiDung.setPreferredSize(new java.awt.Dimension(1125, 657));
        PanelNoiDung.setRoundBottomRight(20);
        PanelNoiDung.setRoundTopLeft(20);
        PanelNoiDung.setRoundTopRight(20);
        PanelNoiDung.setRoundBottomLeft(20);

        javax.swing.GroupLayout PanelNoiDungLayout = new javax.swing.GroupLayout(PanelNoiDung);
        PanelNoiDung.setLayout(PanelNoiDungLayout);
        PanelNoiDungLayout.setHorizontalGroup(
            PanelNoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1125, Short.MAX_VALUE)
        );
        PanelNoiDungLayout.setVerticalGroup(
            PanelNoiDungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 651, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PanelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(PanelCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 338, Short.MAX_VALUE)
                        .addComponent(PanelDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PanelChucNang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PanelThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(PanelNoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(PanelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PanelDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PanelCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PanelThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PanelChucNang, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PanelNoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }                 
    
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TrangChu trang_mau = new TrangChu();
                trang_mau.setVisible(true);
                trang_mau.setLocationRelativeTo(null);
                
            }
        });
    }

    // Khai báo                    
    private javax.swing.JButton ButtonDangXuat;
    private javax.swing.JLabel LabelBanHang;
    private javax.swing.JLabel LabelCaPheSGU;
    private javax.swing.JLabel LabelCalendarIcon;
    private javax.swing.JLabel LabelChucVu;
    private javax.swing.JLabel LabelDate;
    private javax.swing.JLabel LabelIcon;
    private javax.swing.JLabel LabelKhachHang;
    private javax.swing.JLabel LabelKhuyenMai;
    private javax.swing.JLabel LabelLichLam;
    private javax.swing.JLabel LabelMon;
    private javax.swing.JLabel LabelNguyenLieu;
    private javax.swing.JLabel LabelNhaCungCap;
    private javax.swing.JLabel LabelNhanVien;
    private javax.swing.JLabel LabelNhapHang;
    private javax.swing.JLabel LabelTen;
    private javax.swing.JLabel LabelThongKe;
    private javax.swing.JLabel LabelThongTinIcon;
    private javax.swing.JLabel LabelTitle;
    private javax.swing.JLabel LabelXinChao;
    private Util.PanelRound PanelCalendar;
    private Util.PanelRound PanelChucNang;
    private Util.PanelRound PanelDangXuat;
    private Util.PanelRound PanelLogo;
    private Util.PanelRound PanelNoiDung;
    private javax.swing.JLabel PanelTen;
    private Util.PanelRound PanelThongTin;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration                   
}
