using System;
using System.IO;
using System.Windows.Forms;
using System.Runtime.Serialization.Formatters.Binary;


namespace ZeroToHero
{
    public partial class SerializerTestForm1 : Form
    {
        private Button button1;
        private Button button2;
        private TextBox textBox1;
        private TextBox textBox2;
        private TextBox textBox3;
        private TextBox textBox4;
        private TextBox textBox5;
        private TextBox textBox6;
        private TextBox textBox7;
        private TextBox textBox8;
        private string fileName = Directory.GetCurrentDirectory() + "\\output1.txt";
        public void SerializationTestForm1()
        {
            InitializeComponent();
        }

        private void InitializeComponent()
        {
            this.button1 = new System.Windows.Forms.Button();
            this.button2 = new System.Windows.Forms.Button();
            this.textBox1 = new System.Windows.Forms.TextBox();
            this.textBox2 = new System.Windows.Forms.TextBox();
            this.textBox3 = new System.Windows.Forms.TextBox();
            this.textBox4 = new System.Windows.Forms.TextBox();
            this.textBox5 = new System.Windows.Forms.TextBox();
            this.textBox6 = new System.Windows.Forms.TextBox();
            this.textBox7 = new System.Windows.Forms.TextBox();
            this.textBox8 = new System.Windows.Forms.TextBox();
            this.SuspendLayout();
            this.ResumeLayout(false);

        }

        private void button1_Click(object sender, EventArgs e)
        {
            button1.Enabled = false;
            String name = textBox1.Text;
            String address = textBox2.Text;
            int id = Convert.ToInt32(textBox3.Text);
            String courseInfo = textBox4.Text;
            StudentInfo s = new StudentInfo(name, address, courseInfo, id);

            FileStream fileStream = new FileStream(fileName, FileMode.Create);
            BinaryFormatter bf = new BinaryFormatter();
            bf.Serialize(fileStream, s);
            fileStream.Close();
            button1.Enabled = true;
        }
        private void button2Click(object sender, EventArgs e)
        {
            FileStream fileStream2 = new FileStream(fileName, FileMode.Open);
            BinaryFormatter bf2 = new BinaryFormatter();
            StudentInfo si = new StudentInfo();
            si = (StudentInfo)bf2.Deserialize(fileStream2);
            textBox8.Text = si.Name;
            textBox7.Text = si.Address;
            textBox6.Text = "" + si.ID;
            textBox5.Text = si.CourseInfo;
            fileStream2.Close();

        }
    }
}

