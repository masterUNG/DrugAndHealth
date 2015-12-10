package appewtc.masterung.drugandhealth;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by masterUNG on 11/10/15 AD.
 */
public class MyOpenHelper extends SQLiteOpenHelper {

    //Explicit
    private static final String DATABASE_NAME = "drug.db";
    private static final int DATABASE_VERSION = 1;
    private static final String CREATE_DRUG_TABLE = "create table drugTABLE (_id integer primary key, Drug_Name text, Type1 text, Type2 text, Properties text, HowToUse text);";
    private static final String CREATE_USER_TABLE = "create table userTABLE (_id integer primary key, User text, History text, Used text, Allergies text, Resistance text, MyDrug text, Alert text);";

    public MyOpenHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }   // Constructor

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_DRUG_TABLE);
        db.execSQL(CREATE_USER_TABLE);

        //Update drugTABLE
        String[] strDrug = new String[71];
        strDrug[0] = "insert into drugTABLE VALUES (null, 'ยาลดกรดอะลูมินา', 'เม็ด', 'na', 'บรรเทาอาการจุกเสียด ท้องเฟ้อ และปวดท้องิ', 'เคี้ยวยาก่อนกลืนรับประทานก่อนอาหาร 1 หรือ 2 ชั่วโมง ผู้ใหญ่รับประทานครั้งละ 1-4 เม็ด เด็ก 6-12 ปี รับประทานครั้งละ 1-2 เม็ด');";
        strDrug[1] = "insert into drugTABLE VALUES (null, 'ยาลดกรดอะลูมินา', 'น้ำ', 'na', ',บรรเทาอาการจุกเสียด ท้องเฟ้อ และปวดท้อง', 'เขย่าขวดก่อนใช้ยารับประทานก่อนอาหาร 1/2 ชั่วโมง หรือหลังอาหาร 1 ชั่วโมง หรือเมื่อมีอาการผู้ใหญ่ รับประทานครั้งละ 1-4 ช้อนชาเด็ก 6-12 ปี รับประทานครั้งละ 1-2 ช้อนชาเด็ก 3-6 ปี รับประทานครั้งละ 1/2-1 ช้อนชา');";
        strDrug[2] = "insert into drugTABLE VALUES (null, 'ยาแก้ท้องอืดโซดามินท์', 'เม็ด', 'na', 'บรรเทาอาการจุกเสียด ลดอาการระคายเคือง เนื่องจากมีกรดมากในกระเพาะอาหาร', 'รับประทานหลังอาหาร 1 ชั่วโมง หรือเมื่อมีอาการผู้ใหญ่รับประทานครั้งละ 3-6 เม็ดเด็ก 6-12 ปี รับประทานครั้งละ 1-3 เม็ด');";
        strDrug[3] = "insert into drugTABLE VALUES (null, 'ยาขับลม', 'น้ำ', 'na', 'บรรเทาอาการท้องขึ้น ท้องอืด ท้องเฟ้อ และขับลมในกระเพาะอาหาร', 'เขย่าขวดก่อนใช้ยารับประทานวันละ 3-4 ครั้งผู้ใหญ่ รับประทานครั้งละ 1 หรือ 2 ช้อนโต๊ะ เด็ก 6-12 ปี รับประทานครั้งละ 1/2 หรือ 1 ช้อนโต๊ะ');";
        strDrug[4] = "insert into drugTABLE VALUES (null, 'ยาธาตุน้ำแดง', 'น้ำ', 'na', 'บรรเทาอาการปวดท้องเนื่องจากจุกเสียด ท้องขึ้น ท้องเฟ้อิ', 'เขย่าขวดก่อนใช้ยารับประทานก่อนอาหารวันละ 3 ครั้งผู้ใหญ่ รับประทานครั้งละ 1 หรือ 2 ช้อนโต๊ะเด็ก 6-12 ปี รับประทานครั้งละ 1/2 หรือ 1 ช้อนโต๊ะ');";
        strDrug[5] = "insert into drugTABLE VALUES (null, 'ยาแก้ท้องอืดโซเดียมไปคาร์บอเนต', 'น้ำ', 'na', 'บรรเทาอาการท้องอืด ท้องขึ้น ท้องเฟ้อ เนื่องจากมีกรดมากในกระเพาะอาหาร', 'ใช้ป้อนให้ทารกและเด็กหลังอาหาร หรือเมื่อมีอาการ ไม่ควรให้เกินวันละ 6 ครั้งเด็กอายุ 2-3 ปี ครั้งละ 2-3 ช้อนชาเด็กอายุ 6-12 เดือน ครั้งละ 2 ช้อนชาเด็กอายุ 1-6 เดือน ครั้งละ 1 ช้อนชาทารกแรกเกิด-1 เดือน ไม่ควรใช้้');";
        strDrug[6] = "insert into drugTABLE VALUES (null, 'ยาแก้ท้องอืด ท้องเฟ้อ ทิงเจอร์', 'ทา', 'na', 'บรรเทาอาการท้องขึ้น ท้องเฟ้อ ปวดท้องในเด็กิ', 'ทาบางๆ ที่หน้าท้อง วันละ 2-3 ครั้ง้');";
        strDrug[7] = "insert into drugTABLE VALUES (null, 'ยาแก้ท้องเสียผงน้ำตาลเกลือแร่', 'อื่นๆ', 'na', 'ทดแทนการเสียน้ำในรายที่มีอาการท้องร่วง หรือในรายที่มีอาเจียนมากๆ และป้องกันการช็อคเนื่องจากการที่ร่างกายขาดน้ำ', 'เทผงยาทั้งซองละลายในน้ำสะอาด เช่น น้ำต้มสุกที่เย็นแล้ว ประมาณ 250 มิลลิลิตร (1 แก้ว) ให้ดื่มมากๆ เมื่อเริ่มมีอาการท้องร่วง ถ้าถ่ายบ่อยให้ดื่มบ่อยครั้งขึ้น ถ้าอาเจียนด้วยให้ดื่มทีละน้อยแต่บ่อยครั้งเด็กอายุมากกว่า 2 ปี-ผู้ใหญ่ ให้ดื่มสารละลายเกลือแร่ประมาณ 1 แก้ว (250 มิลลิลิตร) ต่อการถ่ายอุจจาระ 1 ครั้ง หรือตามความกระหายของผู้ป่วย้');";
        strDrug[8] = "insert into drugTABLE VALUES (null, 'ยาระบายกลีเซอรีนสำหรับเด็ก', 'อื่นๆ', 'na', 'สำหรับบรรเทาอาการท้องผูกเพื่อช่วยการขับถ่ายิ', 'ใช้เหน็บทวารหนักครั้งละ 1 แท่ง เมื่อต้องการ ควรรอไว้ 15 นาที เพื่อให้ตัวยาละลาย้');";
        strDrug[9] = "insert into drugTABLE VALUES (null, 'ยาระบายกลีเซอรีนสำหรับผู้ใหญ่', 'อื่นๆ', 'na', 'สำหรับบรรเทาอาการท้องผูกเพื่อช่วยการขับถ่าย', 'ใช้เหน็บทวารหนักครั้งละ 1 แท่ง เมื่อต้องการ ควรรอไว้ 15 นาที เพื่อให้ตัวยาละลาย้');";
        strDrug[10] = "insert into drugTABLE VALUES (null, 'ยาระบายแมกนีเซีย', 'น้ำ', 'na', 'ยาระบายแก้อาการ จุก เสียดิ', 'เขย่าขวดก่อนใช้ยารับประทานก่อนนอนหรือตื่นนอนเช้าผู้ใหญ่ รับประทานครั้งละ 2-3 ช้อนโต๊ะ (30-45 มิลลิลิตร)');";
        strDrug[11] = "insert into drugTABLE VALUES (null, 'ยาระบายมะขามแขก', 'เม็ด', 'na', 'ยาระบายแก้อาการ จุก เสียดิ', ',รับประทานก่อนนอนหรือตื่นนอนเช้าผู้ใหญ่ รับประทานครั้งละ 3-4 เม็ดเด็ก 6-12 ปี รับประทานครั้งละ 1-2 เม็ด้');";
        strDrug[12] = "insert into drugTABLE VALUES (null, 'ยาระบายโซเดียมคลอไรด์', 'อื่นๆ', 'na', 'สำหรับบรรเทาอาการท้องผูก ใช้สวนทวารให้ถ่ายอุจจาร', 'วิสวนเข้าทางทวารหนัก แล้วกลั้นไว้จนทนไว้ไหวจึงเข้าส้วม' );";
        strDrug[13] = "insert into drugTABLE VALUES (null, 'ยาถ่ายพยาธิตัวกลม มีเบนดาโซล', 'เม็ด', 'na', 'ถ่ายพยาธิเส้นด้ายตัวกลม', 'เคี้ยวยาให้ละเอียดก่อนกลืนสำหรับพยาธิเส้นด้ายและพยาธิเข็มหมุด ทั้งเด็กอายุตั้งแต่ 2 ปีขึ้นไปและผู้ใหญ่ รับประทานครั้งละ 1 เม็ด หลังอาหารเย็นเพียงครั้งเดียว้');";
        strDrug[14] = "insert into drugTABLE VALUES (null, 'ยาลดไข้พาราเซตามอล 500 มก.', 'เม็ด', 'na', 'ลดไข้ บรรเทาอาการปวด', 'รับประทานหลังอาหารทันทีหรือขณะท้องไม่ว่างแล้วดื่มน้ำตามมากๆ รับประทานทุกๆ 4 –6 ชั่วโมงเมื่อมีอาการ ไม่ควรรับประทานเกินวันละ 5 ครั้งผู้ใหญ่ รับประทานครั้งละ 1-2 เม็ดเด็ก 6-12 ปี รับประทานครั้งละ 1 เม็ดเด็ก 3-6 ปี รับประทานครั้งละ 1/2 เม็ด้');";
        strDrug[15] = "insert into drugTABLE VALUES (null, 'ยาลดไข้พาราเซตามอล 325 มก.', 'เม็ด', 'na', 'ลดไข้ บรรเทาอาการปวดิ', 'รับประทานทุก 4 หรือ 6 ชั่วโมง เมื่อมีอาการ ไม่ควรรับประทานเกินวันละ 4 ครั้งผู้ใหญ่ รับประทานครั้งละ 1-2 เม็ดเด็ก 6-12 ปี รับประทานครั้งละ 1/2-1 เม็ด้');";
        strDrug[16] = "insert into drugTABLE VALUES (null, 'ยาลดไข้พาราเซตามอล 120 มก.', 'น้ำ', 'na', 'ลดไข้ บรรเทาอาการปวด', 'รับประทานทุก 4 หรือ 6 ชั่วโมง เมื่อมีอาการ ไม่ควรรับประทานเกินวันละ 5 ครั้งเด็กอายุ 3-6 ปี รับประทานครั้งละ 1-2 ช้อนชา (5-10 มิลลิลิตร)เด็กอายุ 1-3 ปี รับประทานครั้งละ 1/2-1 ช้อนชา (2.5-5 มิลลิลิตร)เด็กอายุ 6 เดือน-1 ปี รับประทานครั้งละ 1/2 ช้อนชา (2.5 มิลลิลิตร)้');";
        strDrug[17] = "insert into drugTABLE VALUES (null, 'ยาแก้แพ้ คลอร์เฟนิรามีน', 'เม็ด', 'na', 'บรรเทาอาการแพ้ เช่น ลมพิษ น้ำมูกไหลิ', 'รับประทานทุก 4-6 ชั่วโมง เมื่อมีอาการผู้ใหญ่ รับประทานครั้งละ 1-2 เม็ด ไม่ควรรับประทานเกินวันละ 12 เม็ดเด็ก 6-12 ปี รับประทานครั้งละ 1 เม็ด ไม่ควรรับประทานเกินวันละ 6 เม็ด้');";
        strDrug[18] = "insert into drugTABLE VALUES (null, 'ยาแก้ไอแอมโมเนียมขับเสมหะสำหรับเด็ก', 'น้ำ', 'na', 'บรรเทาอาการไอ ขับเสมหะิ', 'วิรับประทานวันละ 3-4 ครั้งเด็ก 6-12 ปี รับประทานครั้งละ 2 ช้อนชา (10 มิลลิลิตร)เด็ก 3-6 ปี รับประทานครั้งละ 1 ช้อนชา ( 5 มิลลิลิตร)เด็ก 1-3 ปี รับประทานครั้งละ 1/2 ช้อนชา 2.5 มิลลิลิตร');";
        strDrug[19] = "insert into drugTABLE VALUES (null, 'ยาแก้ไอน้ำดำ', 'น้ำ', 'na', 'บรรเทาอาการไอและช่วยขับเสมหะิ', 'วิเขย่าขวดก่อนใช้รับประทานวันละ 3-4 ครั้งผู้ใหญ่ รับประทานครั้งละ 1-2 ช้อนชา (5-10 มิลลิลิตร)เด็ก 6-12 ปี รับประทานครั้งละ 1/2 - 1 ช้อนชา (2.5-5 มิลลิลิตร)');";
        strDrug[20] = "insert into drugTABLE VALUES (null, 'ยาดมแก้วิงเวียนแอมโมเนีย', 'อื่นๆ', 'na', 'ดม บรรเทาอาการวิงเวียน หน้ามืด หรือทาผิวหนัง บรรเทาอาการเนื่องจากพิษแมลงกัดต่อย หรือถูกพืชมีพิษิ', 'ใช้ชุบสำลีดม หรือใช้ทา้');";
        strDrug[21] = "insert into drugTABLE VALUES (null, 'ยาดมแก้วิงเวียนแก้คัดจมูก', 'อื่นๆ', 'na', 'บรรเทาอาการคัดจมูก หายใจไม่ออก และบรรเทาอาการวิงเวียนศรีษะิ', 'วิช้สูดดม หรือทาบางๆ ตามคอและหน้าอก');";
        strDrug[22] = "insert into drugTABLE VALUES (null, 'ยาทาระเหยขี้ผึ้ง', 'ทา', 'na', 'บรรเทาอาการคัดจมูกและลดอาการอั้นเนื่องจากหวัด', 'ทายาที่บริเวณลำคอหน้าอกและหลัง้');";
        strDrug[23] = "insert into drugTABLE VALUES (null, 'ยาเม็ดแก้เมารถ เมาเรือ ไดเมนไฮคริเนท', 'เม็ด', 'na', 'ใช้ป้องกันอาการเมารถ เมาเรือ', 'ผู้ใหญ่รับประทานครั้งละ 1 เม็ดก่อนออกเดินทางอย่างน้อย 30 นาที');";
        strDrug[24] = "insert into drugTABLE VALUES (null, 'ยาหยอดตาซัลฟาเซดาไมด์', 'น้ำ', 'na', 'รักษาอาการตาแดง ตาอักเสบ จากโรคติดเชื้อ', 'ใช้หยอดตาครั้งละ 1-2 หยด วันละ 3-4 ครั้ง');";
        strDrug[25] = "insert into drugTABLE VALUES (null, 'ยาล้างตาโซเดียมคลอไรด์', 'น้ำ', 'na', 'ใช้ล้างตาเพื่อบรรเทาอาการแสบตา ระคายเคืองตา อันเนื่องมาจาก ผง ควัน สิ่งสกปรกเข้าตา', 'ใช้ล้างตาวันละ 2-3 ครั้ง');";
        strDrug[26] = "insert into drugTABLE VALUES (null, 'ยากวาดคอ', 'อื่นๆ', 'na', 'บรรเทาอาการอักเสบ และเจ็บในลำคอ', 'เติมน้ำสะอาดเท่าตัวแล้วใช้กวาดคอในผู้ใหญ่');";
        strDrug[27] = "insert into drugTABLE VALUES (null, 'ยารักษาลิ้นเป็นฝ้าเยนเชี่ยนไวโอเลต', 'ทา', 'na', 'รักษากระพุ้งแก้มและลิ้นเป็นฝ้าขาว', 'ใช้สำลีชุบยาทาตามบริเวณที่เป็น วันละ 2-3 ครั้ง้');";
        strDrug[28] = "insert into drugTABLE VALUES (null, 'ยาแก้ปวดฟันพาร์ต้า', 'น้ำ', 'na', 'บรรเทาอาการปวดฟัน', 'ใช้ไม้เล็กๆ พันสำลีชุบยาอุดฟันตรงที่เป็นรู');";
        strDrug[29] = "insert into drugTABLE VALUES (null, 'ยาอมบรรเทาอาการระคายคอ', 'เม็ด', 'na', 'ทำให้ชุ่มคอบรรเทาอาการระคายคอิ', 'ให้อมช้าๆ ครั้งละ 1-5 เม็ด');";
        strDrug[30] = "insert into drugTABLE VALUES (null, 'ยาอมบรรเทาอาการเจ็บคอเมโทคาร์โซ9', 'เม็ด', 'na', 'บรรเทาอาการเจ็บคอ', 'ผู้ใหญ่และเด็กอายุตั้งแต่ 6 ปีขึ้นไป อมครั้งละ 1 เม็ดให้ละลายช้าๆในปากทุก 2-3 ชั่วโมง');";
        strDrug[31] = "insert into drugTABLE VALUES (null, 'ยาใส่แผลทิงเจอร์ไอโอดีน', 'ทา', 'na', 'รักษาแผลสด', 'ใช้สำลีสะอาดชุบยาทาที่แผล');";
        strDrug[32] = "insert into drugTABLE VALUES (null, 'ยาใส่แผลทิงเจอร์ไทเมอรอซอล', 'ทา', 'na', 'รักษาบาดแผลิ', 'ใช้สำลีสะอาดชุบยาทาที่แผล้');";
        strDrug[33] = "insert into drugTABLE VALUES (null, 'ยาใส่แผลโพวิโดน', 'ทา', 'na', 'ทำความสะอาดบาดแผล', 'ใช้สำลีสะอาดชุบยาทาที่แผล');";
        strDrug[34] = "insert into drugTABLE VALUES (null, 'ยาไอโซโพรพิล', 'ทา', 'na', 'ทำความสะอาดบาดแผล', 'ใช้สำลีสะอาดชุบยาทาที่แผล');";
        strDrug[35] = "insert into drugTABLE VALUES (null, 'ยาเอทิลแอลกอฮอล์', 'ทา', 'na', 'ทำความสะอาดบาดแผล', 'ใช้ทำความสะอาดรอยบาดแผล้');";
        strDrug[36] = "insert into drugTABLE VALUES (null, 'น้ำเกลือล้างแผล', 'ทา', 'na', 'ใช้ทำความสะอาดบาดแผล', 'ใช้ทำความสะอาดรอบๆ บาดแผล');";
        strDrug[37] = "insert into drugTABLE VALUES (null, 'ยารักษาแผลติดเชื้อซัลฟ่าไดอาซีน', 'ทา', 'na', 'ใช้ทาภายนอกเพื่อรักษาการติดเชื้อของแผล ซึ่งเกิดจากไฟไหม้ หรือน้ำร้อนลวก', 'ใช้ทาบริเวณแผลที่เป็น ควรทำความสะอาดแผล แล้วทาครีมทุกวัน วันละ 1-2 ครั้ง');";
        strDrug[38] = "insert into drugTABLE VALUES (null, 'ยาหม่องชนิดขี้ผึ้ง', 'ทา', 'na', 'บรรเทาอาการปวด บวม อักเสบ เนื่องจากแมลงกัดต่อย หรือปวดเมื่อยกล้ามเนื้อ', 'ทาและนวดบริเวณที่มีอาการ้');";
        strDrug[39] = "insert into drugTABLE VALUES (null, 'ยารักษาหิดเหาเบนซิลเบนโซแอด', 'น้ำ', 'na', 'รักษาโรคหิติ', 'เขย่าขวดก่อนใช้ยา แบ่งยา มาเติมน้ำเท่าตัว แล้วผสมให้เข้ากันสำหรับรักษาหิดอาบน้ำให้สะอาด ใช้ผ้าหรือแปรงอ่อนๆ ถูตรงบริเวณที่มีผื่นคัน แล้วทายานี้ให้ทั่วทิ้งไว้ 24 ชั่วโมง แล้วจึงอาบน้ำ วันรุ่งขึ้นให้ทาซ้ำใหม่อีกครั้ง ตามวิธีเดิมสำหรับรักษาเหาและโลน ใส่ยานี้ให้ทั่วศีรษะหรือบริเวณ ที่มีเหาหรือโลน ทิ้งไว้ 1 วัน ถ้าเป็นมากให้ใช้ยา 2 ครั้งต่อวัน');";
        strDrug[40] = "insert into drugTABLE VALUES (null, 'ยารักษาหิดขี้ผึ้งกำมะถัน', 'ทา', 'na', 'รักษาโรคหิต', 'ใช้ทาบริเวณที่เป็นหิด วันละ 2-3 ครั้ง');";
        strDrug[41] = "insert into drugTABLE VALUES (null, 'ยารักษากลากเกลื้อนโซเดียมไทโอซัลเฟต', 'ทา', 'na', 'รักษากลากเกื่อน และโรคน้ำกัดเท้า', 'ใช้ทาบริเวณที่เป็นโรควันละ 2-3 ครั้ง');";
        strDrug[42] = "insert into drugTABLE VALUES (null, 'ยารักษาโรคผิวหนังคาลาไมน์', 'ทา', 'na', 'รักษาโรคผิวหนังเรื้อรังบางชนิด เช่น เรื้อนกวาง ผิวหนังเป็นผื่นคัน', 'ใช้ทาบริเวณที่เป็นโรควันละ 2-3 ครั้ง');";
        strDrug[43] = "insert into drugTABLE VALUES (null, 'ยาเม็ดวิตามินบีรวม', 'เม็ด', 'na', 'ป้องกันการขาดวิตามินบี และบำรุงร่างกาย', 'รับประทานวันละ 1 ครั้งหลังอาหารผู้ใหญ่ รับประทานครั้งละ 1-2 เม็ดเด็ก 6-12 ปี รับประทานครั้งละ 1 เม็ด');";
        strDrug[44] = "insert into drugTABLE VALUES (null, 'ยาเม็ดวิตามินซี', 'เม็ด', 'na', 'ป้องกันการขาดวิตามินซี', 'รับประทานวันละ 1 ครั้งผู้ใหญ่ รับประทานครั้งละ 2 เม็ดเด็ก 6-12 ปี รับประทานครั้งละ 1 เม็ด');";
        strDrug[45] = "insert into drugTABLE VALUES (null, 'ยาเม็ดบำรุงโลหิตเฟอร์รัสซัลเฟต', 'เม็ด', 'na', 'รักษาโรคโลหิตจางเนื่องจากขาดธาตุเหล็กในผู้ใหญ่', 'รับประทานครั้งละ 1-2 เม็ด วันละ 3 ครั้ง หลังอาหาร');";
        strDrug[46] = "insert into drugTABLE VALUES (null, 'ยาเม็ดวิตามินรวม', 'เม็ด', 'na', 'ป้องกันการขาดวิตามินสำหรับผู้ใหญ่', 'รับประทานวันละ 1 เม็ด');";
        strDrug[47] = "insert into drugTABLE VALUES (null, 'น้ำมันตับปลา', 'เม็ด', 'na', 'ป้องกันการขาดวิตามิน A และ D', 'ผู้ใหญ่รับประทานวันละ 1 เม็ด');";
        strDrug[48] = "insert into drugTABLE VALUES (null, 'น้ำมันตับปลา', 'น้ำ', 'na', 'ป้องกันการขาดวิตามิน A และ D', 'เขย่าขวดก่อนใช้เด็กอายุตั้งแต่4 ปีขึ้นไป รับประทานวันละ 1 ช้อนชาเด็กอายุ 1-4 ปี รับประทานวันละ 1/2 ช้อนชาเด็กแรกเกิด -1 ปี รับประทานวันละ 1/4 ช้อนชา');";

        strDrug[49] = "insert into drugTABLE VALUES (null, 'เจลว่านหางจระเข้', 'ยาใช้ภายนอก', 'ทา', 'รักษาแผลไฟไหม้น้ำร้อนลวก', 'ทาบริเวณที่ถูกไฟไหม้ น้ำร้อนลวกวันละ 2-3 ครั้ง');";
        strDrug[50] = "insert into drugTABLE VALUES (null, 'มะขามแขก', 'ยาใช้ภานใน', 'รับประทาน', 'ช่วยบรรเทาอาการท้องผูก', 'ใช้ฝักประมาณ 10-15 ฝัก นำมาต้มกับน้ำ 1 ถ้วยแก้วประมาณ 4 นาที และใส่เกลือเล็กน้อยเพื่อช่วยกลบรสเฝื่อน แล้วใช้รับประทานเพียงครั้งเดียว');";
        strDrug[51] = "insert into drugTABLE VALUES (null, 'หญ้าหนวดแมว', 'ยาใช้ภานใน', 'รับประทาน', 'ช่วยขับปัสสาวะและรักษานิ่วในกระเพาะปัสสาวะ', 'ใช้ต้นกับใบประมาณ 90-120 กรัม นำมาต้มกับน้ำ ดื่มก่อนอาหารครั้งละ 1 ถ้วยชา หรือประมาณ 75 cc. วันละ 3 ครั้ง');";
        strDrug[52] = "insert into drugTABLE VALUES (null, 'เพชรสังฆาต', 'ยาใช้ภานใน', 'รับประทาน', 'ขับลมในลำไส้ช่วยบรรเทาอาการริดสิดวงทวารหนัก', 'ใช้แบบแห้งนำมาบดเป็นผง ใส่แคปซูลเบอร์ 2 ขนาด 250 มิลกรัม รับประทานครั้งละ 2 แคปซูล วันละ 4 ครั้งก่อนอาหาร รับประทาน 1 อาทิตย์ก็จะเห็นผล');";
        strDrug[53] = "insert into drugTABLE VALUES (null, 'กระเทียมแคปซูล', 'ยาใช้ภานใน', 'เม็ด', 'ช่วยลดระดับคอเลสตอรอลในเลือดและละลายลิ่มเลือดได้', 'รับประทานครั้งละ 1-3 เม็ด วันละ 3 ครั้ง หลังอาหาร');";
        strDrug[54] = "insert into drugTABLE VALUES (null, 'ธรณีสัณฑะฆาต', 'ยาใช้ภานใน', 'เม็ด', 'แก้ท้องผูกปวดท้อง', 'ให้ทาน 2-4 แคปซูล ก่อนนอน 5 วัน ทานน้ำมาก ๆ ระหว่างวัน และหากวันไหนท้องผูกจึงทานอีกครั้ง');";
        strDrug[55] = "insert into drugTABLE VALUES (null, 'ขี้เหล็ก', 'ยาใช้ภานใน', 'รับประทาน', 'ช่วยแก้อาการท้องผูก เป็นยาระบาย', 'ใช้ใบอ่อน 2-3 กำมือ นำมาต้มกับน้ำครึ่งถ้วยแก้วเติมเกลือเล้กน้อย ใช้ดื่มหลังตื่นนอนหรือก่อนอาหารเช้าเพียงครั้งเดียว');";
        strDrug[56] = "insert into drugTABLE VALUES (null, 'บอระเพ็ด', 'ยาใช้ภานใน', 'รับประทาน', 'ช่วยลดน้ำตาลในเลือด แก้ไข้ ช่วยในการเจริญอาหาร', 'นำบอระเพ็ดตากแห้ง แล้วนำมาบดใส่แคปซูล ทานวันละ 2-3 แคปซูลโดยทานก่อนอาหารเช้า เย็น');";
        strDrug[57] = "insert into drugTABLE VALUES (null, 'มะระขี้นก', 'ยาใช้ภานใน', 'รับประทาน', 'ลดน้ำตลาดในเลือด ช่วยเจริญอาหาร ลดไข้', 'ใช้ผลสดของมะระขี้นกต้มรับประทาน หรือจะใช้รากสดของมะระขี้นกประมาณ 30 กรัม ต้มกับน้ำดื่ม หรือใช้เถาแห้งประมาณ 3 กรัมต้มกับน้ำดื่ม');";
        strDrug[58] = "insert into drugTABLE VALUES (null, 'สหัสธารา', 'ยาใช้ภานใน', 'รับประทาน', 'รักษาอาการปวดเมื่อยกล้ามเนื้อ ปวดข้อ อาการชา', 'รับประทาน 4-6 เม็ด ก่อนอาหาร เช้า กลางวัน เย็นห');";
        strDrug[59] = "insert into drugTABLE VALUES (null, 'เหงือกปลาหมอ', 'ยาใช้ภานนอก', 'ทา', 'ช่วยรักษาภูมิแพ้ ผื่นคัน', 'ใช้ต้นสดและใบสดล้างสะอาดประมาณ 3-4 กำมือ นำมาสับแล้วต้มแล้วนำมาทาแก้ผื่นคันติดต่อกัน 3-4 ครั้ง');";
        strDrug[60] = "insert into drugTABLE VALUES (null, 'ลูกยอ', 'ยาใช้ภานใน', 'รับประทาน', 'แก้อาหารวิงเวียนศรีษะหรืออาเจียน', 'ใช้ผลดิบแก่ฝานเป็นชิ้นบางๆ ย่างไฟให้เหลือง ต้มหรือชงดื่ม ใช้ครั้งละประมาณ 2 กำมือ (10-15 กรัม) เอาน้ำที่ได้จิบทีละน้อยและบ่อยๆ ครั้งจึงจะได้ผลดี');";
        strDrug[61] = "insert into drugTABLE VALUES (null, 'กระชายดำ', 'ยาใช้ภานใน', 'รับประทาน', 'ขับลม แก้ท้องอืด และบำรุงร่างกาย', 'ให้ใช้เหง้าของกระชายดำนำมาปิ้งไฟให้สุกแล้วนำมาตำให้ละเอียดใช้ผสมกับน้ำปูนใสแล้วคั้นเอาแต่น้ำมาดื่มครั้งละ 3-5 ช้อนแกงหลังจากการถ่ายเนื่องมีอาการท้องเดิน');";
        strDrug[62] = "insert into drugTABLE VALUES (null, 'ส้มแขก', 'ยาใช้ภานใน', 'รับประทาน', 'ช่วยลดคอเลสเตอรอลและลดการสร้างไขมัน', 'ใช้ในการปรุงกับอาหารที่มีรสเปรี้ยว เช่น แกงส้ม ต้มยำ');";
        strDrug[63] = "insert into drugTABLE VALUES (null, 'เทพธารา', 'ยาใช้ภานใน', 'รับประทาน', 'รักษาอาการปวดเมื่อย กล้ามเนื้อ ปวดข้อ และบำรุงกำลัง', 'รับประทานหลังอาหาร เช้า กลางวัน เย็น ครั้งละ 1 แคปซูล');";
        strDrug[64] = "insert into drugTABLE VALUES (null, 'ยาห้าราก', 'ยาใช้ภานใน', 'รับประทาน', 'ลดไข้ แก้ปวด', 'ผู้ใหญ่ ครั้งละ 3 แคปซูล รับประทานวันละ 3 ครั้ง ก่อนอาหาร เมื่อมีอาการเด็ก อายุ 6-12 ปี ครั้งละ 2 แคปซูล รับประทานวันละ 3 ครั้ง ก่อนอาหาร เมื่อมีอาการ');";
        strDrug[65] = "insert into drugTABLE VALUES (null, 'น้ำมันไพล', 'ยาใช้ภานนอก', 'ทา', 'ช่วยลดอาการอักเสบ แก้ฟกช้ำ ปวดเมื่อย', 'เใช้ยาทาบริเวณที่มีอาการ');";
        strDrug[66] = "insert into drugTABLE VALUES (null, 'ยาแก้ไอมะขามป้อม', 'ยาใช้ภานใน', 'รับประทาน', 'ช่วยบรรเทาอาการไอ เจ็บคอ', 'จิบเมื่อมีอาการ ได้ทุกเวลา');";
        strDrug[67] = "insert into drugTABLE VALUES (null, 'ดอกคำฟอย', 'ยาใช้ภานใน', 'รับประทาน', 'ลดไขมันในเลือด และลดความดันโลหิต', 'ใช้ดอกแห้ง 2 หยิบมือ (2.5 กรัม) ชงน้ำร้อนครึ่งแก้ว ดื่มเป็นเครื่องดื่มได้');";
        strDrug[68] = "insert into drugTABLE VALUES (null, 'ยาผงหญ้าดอกข้าว', 'ยาใช้ภานใน', 'รับประทาน', 'ช่วยลดการสูบบุหรี่  แก้ไข้', 'ชงกับน้ำร้อน ทิ้งไว้ 5-10 นาที่ รอให้ชา ออกสี กลิ่น แล้วค่อยรัปประทาน 1 ซองชงได้ 2-3 น้ำ จิบบ่อยๆ ช่วยให้ไม่อยากบุหรี่ ไม่อยากข้าว');";
        strDrug[69] = "insert into drugTABLE VALUES (null, 'ยาผงชะพลู', 'ยาใช้ภานใน', 'รับประทาน', 'ช่วยลดน้ำตาลในเลือด แก้ไอ ละลายเสมหะ', 'ใส่ยา 1 ถุงสำหรับชงลงในแก้ว เติมน้ำเดือดตั้งทิ้งไว้ 2-3 นาที ดื่มขณะอุ่น ๆ ครั้งละ 1 แก้ว 3 เวลา หลังอาหาร');";
        strDrug[70] = "insert into drugTABLE VALUES (null, 'เถาวัลย์เปรียง', 'ยาใช้ภานใน', 'รับประทาน', 'ช่วยบรรเทาอาหารปวดกล้ามเนื้อ', 'นำผงจากเถาของเถาวัลย์เปรียง ผสมน้ำรับประทานครั้งละ 500 มิลลิกรัม ถึง 1 กรัม วันละ 3 ครั้ง หลังอาหารทันที');";

        try {

            int intIndex = 0;
            while (intIndex < strDrug.length) {
                db.execSQL(strDrug[intIndex]);
                intIndex += 1;
            }// while

        } catch (Exception e) {

        }



    }   // onCreate

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}   // Main Class
