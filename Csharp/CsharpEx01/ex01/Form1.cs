using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Data.SqlClient;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ex01
{
    public partial class Form1 : Form
    {
        private UserControl userControl1 = new UserControl();
        private UserControl userControl2 = new UserControl();

        private string connectionString = "Data Source=localhost;Initial Catalog=todo;User ID=sa;Password=p@ssWord123;Encrypt=False";

        public Form1()
        {
            InitializeComponent();

            userControl1.Size = new Size(750, 470);
            userControl1.BackColor = Color.White;
            userControl1.Location = new System.Drawing.Point(250, 150);

            userControl2.Size = new Size(750, 470);
            userControl2.BackColor = Color.Blue;
            userControl2.Location = new System.Drawing.Point(250, 150);

            this.Controls.Add(userControl1);
            this.Controls.Add(userControl2);

            this.button5.Click += Button10_Click;
            this.button6.Click += Button10_Click;

        }

        private void Button10_Click(object sender, EventArgs e)
        {
            //Button button = (Button)sender;
            //MessageBox.Show("Test"+button.Text);
            //if(button.Text.Equals("Take Away"))
            //{
            //    MessageBox.Show("Test" + button.Text);
            //}
        }

        private void panel3_Paint(object sender, PaintEventArgs e)
        {

        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void label3_Click(object sender, EventArgs e)
        {

        }

        private void button5_Click(object sender, EventArgs e)
        {

        }

        private void button2_Click(object sender, EventArgs e)
        {
            //Button button = (Button)sender;
            //MessageBox.Show(button.Text);
            //MessageBox.Show("Test" + sender + "event" + e);
            userControl1.BringToFront();
            MessageBox.Show("test111");
        }

        private void button1_Click(object sender, EventArgs e)
        {
            //Button button = (Button)sender;
            //MessageBox.Show(button.Text);
            //MessageBox.Show("Test"+sender+"event"+e);
            userControl2.BringToFront();
            MessageBox.Show("test222");

            DataGridView dgb = new DataGridView();
            dgb.Dock = DockStyle.Fill;
            //dgb.KeyDown += Dgb_KeyDown;

            //dgb.ColumnHeadersDefaultCellStyle.BackColor = Color.Navy;
            //dgb.ColumnHeadersDefaultCellStyle.ForeColor = Color.White;
            //dgb.ColumnHeadersDefaultCellStyle.Font = new System.Drawing.Font("Century Gothic", 11.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));

            //dgb.GridColor = Color.Black;
            //dgb.RowHeadersVisible = false; // 행 헤더 숨기기
            //dgb.AutoSizeColumnsMode = DataGridViewAutoSizeColumnsMode.Fill; // 열 너비 자동 조정
            //dgb.DefaultCellStyle.SelectionBackColor = Color.LightBlue; // 선택된 셀 배경색
            //dgb.DefaultCellStyle.SelectionForeColor = Color.Black; // 선택된 셀 텍스트 색

            // 필요 시 다른 속성 설정
            //dgb.AutoSizeColumnsMode = DataGridViewAutoSizeColumnsMode.Fill;
            dgb.AllowUserToAddRows = false;
            dgb.RowHeadersVisible = false;


            // connection 10개 thread Pool JPA
            using (SqlConnection connection = new SqlConnection(connectionString))
            {
                try
                {
                    connection.Open();

                    // SqlCommand 설정
                    using (SqlCommand command = new SqlCommand("todo_select", connection))
                    {
                        command.CommandType = CommandType.StoredProcedure;

                        // 필요한 경우 파라미터 추가
                        command.Parameters.AddWithValue("@Param1", "no hangle");

                        // SqlDataAdapter를 사용하여 데이터를 가져옴
                        using (SqlDataAdapter adapter = new SqlDataAdapter(command))
                        {
                            DataSet dataSet = new DataSet();
                            adapter.Fill(dataSet); // DataSet에 모든 결과셋을 채움

                            // DataSet의 두 번째 테이블(1번째 인덱스) 선택
                            if (dataSet.Tables.Count > 1) // 두 번째 테이블이 있는지 확인
                            {
                                DataTable dataTable = dataSet.Tables[1];
                                DataTable table = new DataTable("TodoList");

                                // 컬럼 추가
                                table.Columns.Add("Id", typeof(int));
                                table.Columns.Add("Title", typeof(string));
                                table.Columns.Add("Description", typeof(string));
                                table.Columns.Add("IsCompleted", typeof(bool));
                                table.Columns.Add("DueDate", typeof(DateTime));

                                // 데이터 행 추가
                                table.Rows.Add(1, "이거이거", "Purchase vegetables and fruits.", false, DateTime.Parse("2025-01-20"));
                                table.Rows.Add(2, "C#으로 취직 하면 좋을텐데", "Finish math assignment.", false, DateTime.Parse("2025-01-18"));
                                table.Rows.Add(3, "뭐하나 새로 배우는게 어렵네...", "Tidy up the bedroom.", false, DateTime.Parse("2025-01-17"));
                                table.Rows.Add(4, "Plan Birthday Party", "Prepare guest list and menu.", false, DateTime.Parse("2025-02-10"));
                                table.Rows.Add(5, "Schedule Doctor Appointment", "Set up a health check-up.", false, DateTime.Parse("2025-01-25"));

                                dgb.DataSource = table; // DataGridView에 데이터 바인딩
                            }
                            else
                            {
                                MessageBox.Show("두 번째 결과셋이 없습니다.");
                            }

                        }
                    }
                }
                catch (Exception ex)
                {
                    MessageBox.Show($"오류 발생: {ex.Message}");
                }
            }
            userControl2.Controls.Add(dgb);

        }

        private void Dgb_KeyDown(object sender, KeyEventArgs e)
        {
            throw new NotImplementedException();
        }

        private void button6_Click(object sender, EventArgs e)
        {

        }

        private void button3_Click(object sender, EventArgs e)
        {

        }

        private void button4_Click(object sender, EventArgs e)
        {

        }

        private void label4_Click(object sender, EventArgs e)
        {

        }

        private void button14_Click(object sender, EventArgs e)
        {

        }

        private void button12_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }
    }
}

