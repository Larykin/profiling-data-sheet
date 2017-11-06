package com.example.larykin.profilingdatasheet;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by larykin on 27/10/2017.
 */

public class MySQLiteHelper extends SQLiteOpenHelper {

    // Database Version
    private static final int DATABASE_VERSION = 2;
    // Database Name
    private static final String DATABASE_NAME = "PersonDB";

    public MySQLiteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // SQL statement to create book table
        String CREATE_PERSON_TABLE = "CREATE TABLE IF NOT EXISTS people ( " +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " + "location TEXT, " +
                "proxemics TEXT, " + "date TEXT, " + "weather TEXT, " + "temp TEXT, " +
                "gender INTEGER, " + "height TEXT, " + "weight TEXT, " + "handedness INTEGER, " +
                "breathing INTEGER, " + "presence TEXT, " + "posture TEXT, " + "shoes TEXT, " +
                "colors TEXT, " + "breathrate TEXT, " + "blinkrate TEXT, " + "shutterspd TEXT, " +
                "hygiene TEXT, " + "description TEXT, " + "initges TEXT, " + "interges TEXT, " +
                "appreciation INTEGER, " + "acceptance INTEGER, " + "approval INTEGER, " +
                "intelligence INTEGER, " + "pity INTEGER, " + "admiration INTEGER, " +
                "power INTEGER, " + "weaknesses TEXT, " + "dislikes TEXT, " + "pronouns TEXT, " +
                "adjectives TEXT, " + "ght_hand INTEGER, " + "ght_association INTEGER, " +
                "inter2ges TEXT, " + "phrases TEXT, " + "tolookup TEXT, " + "sketch TEXT, " +
                "notes TEXT" + ")";

        // create books table
        db.execSQL(CREATE_PERSON_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older books table if existed
        db.execSQL("DROP TABLE IF EXISTS books");

        // create fresh books table
        this.onCreate(db);
    }

    // Books table name
    private static final String TABLE_PEOPLE = "people";
    // Books Table Columns names
    private static final String KEY_ID = "id";
    private static final String KEY_LOCATION = "location";
    private static final String KEY_PROXEMICS = "proxemics";
    private static final String KEY_DATE = "date";
    private static final String KEY_WEATHER = "weather";
    private static final String KEY_TEMP = "temp";
    private static final String KEY_GENDER = "gender";
    private static final String KEY_HEIGHT = "height";
    private static final String KEY_WEIGHT = "weight";
    private static final String KEY_HANDEDNESS = "handedness";
    private static final String KEY_BREATHING = "breathing";
    private static final String KEY_PRESENCE = "presence";
    private static final String KEY_POSTURE = "posture";
    private static final String KEY_SHOES = "shoes";
    private static final String KEY_COLORS = "colors";
    private static final String KEY_BREATHRATE = "breathrate";
    private static final String KEY_BLINKRATE = "blinkrate";
    private static final String KEY_SHUTTERSPD = "shutterspd";
    private static final String KEY_HYGIENE = "hygiene";
    private static final String KEY_DESCRIPTION = "description";
    private static final String KEY_INITGES = "initges";
    private static final String KEY_INTERGES = "interges";
    private static final String KEY_APPRECIATION = "appreciation";
    private static final String KEY_ACCEPTANCE = "acceptance";
    private static final String KEY_APPROVAL = "approval";
    private static final String KEY_INTELLIGENCE = "intelligence";
    private static final String KEY_PITY = "pity";
    private static final String KEY_ADMIRATION = "admiration";
    private static final String KEY_POWER = "power";
    private static final String KEY_WEAKNESSES = "weaknesses";
    private static final String KEY_DISLIKES = "dislikes";
    private static final String KEY_PRONOUNS = "pronouns";
    private static final String KEY_ADJECTIVES = "adjectives";
    private static final String KEY_GHT_HAND = "ght_hand";
    private static final String KEY_GHT_ASSOCIATION = "ght_association";
    private static final String KEY_INTER2GES = "inter2ges";
    private static final String KEY_PHRASES = "phrases";
    private static final String KEY_TOLOOKUP = "tolookup";
    private static final String KEY_SKETCH = "sketch";
    private static final String KEY_NOTES = "notes";
    private static final String[] COLUMNS = {KEY_ID, KEY_LOCATION, KEY_PROXEMICS, KEY_DATE,
            KEY_WEATHER, KEY_TEMP, KEY_GENDER, KEY_HEIGHT, KEY_WEIGHT, KEY_HANDEDNESS, KEY_BREATHING,
            KEY_PRESENCE, KEY_POSTURE, KEY_SHOES, KEY_COLORS, KEY_BREATHRATE, KEY_BLINKRATE,
            KEY_SHUTTERSPD, KEY_HYGIENE, KEY_DESCRIPTION, KEY_INITGES, KEY_INTERGES, KEY_APPRECIATION,
            KEY_ACCEPTANCE, KEY_APPROVAL, KEY_INTELLIGENCE, KEY_PITY, KEY_ADMIRATION, KEY_POWER,
            KEY_WEAKNESSES, KEY_DISLIKES, KEY_PRONOUNS, KEY_ADJECTIVES, KEY_GHT_HAND, KEY_GHT_ASSOCIATION,
            KEY_INTER2GES, KEY_PHRASES, KEY_TOLOOKUP, KEY_SKETCH, KEY_NOTES};

    public void addPerson(Person person){
        //for logging
        Log.d("addBook", person.toString());

        // 1. get reference to writable DB
        SQLiteDatabase db = this.getWritableDatabase();

        // 2. create ContentValues to add key "column"/value
        ContentValues values = new ContentValues();
        values.put(KEY_LOCATION, person.getLocation()); // get title
        values.put(KEY_PROXEMICS, person.getProxemics());
        values.put(KEY_DATE, person.getDate());
        values.put(KEY_WEATHER, person.getWeather());
        values.put(KEY_TEMP, person.getTemp());
        values.put(KEY_GENDER, person.getGender());
        values.put(KEY_HEIGHT, person.getHeight());
        values.put(KEY_WEIGHT, person.getWeight());
        values.put(KEY_HANDEDNESS, person.getHandedness());
        values.put(KEY_BREATHING, person.getBreathing());
        values.put(KEY_PRESENCE, person.getPresence());
        values.put(KEY_POSTURE, person.getPosture());
        values.put(KEY_SHOES, person.getShoes());
        values.put(KEY_COLORS, person.getColors());
        values.put(KEY_BREATHRATE, person.getBreathrate());
        values.put(KEY_BLINKRATE, person.getBlinkrate());
        values.put(KEY_SHUTTERSPD, person.getShutterspd());
        values.put(KEY_HYGIENE, person.getHygiene());
        values.put(KEY_DESCRIPTION, person.getDescription());
        values.put(KEY_INITGES, person.getInitges());
        values.put(KEY_INTERGES, person.getInterges());
        values.put(KEY_APPRECIATION, person.getAppreciation());
        values.put(KEY_ACCEPTANCE, person.getAcceptance());
        values.put(KEY_APPROVAL, person.getApproval());
        values.put(KEY_INTELLIGENCE, person.getIntelligence());
        values.put(KEY_PITY, person.getPity());
        values.put(KEY_ADMIRATION, person.getAdmiration());
        values.put(KEY_POWER, person.getPower());
        values.put(KEY_WEAKNESSES, person.getWeaknesses());
        values.put(KEY_DISLIKES, person.getDislikes());
        values.put(KEY_PRONOUNS, person.getPronouns());
        values.put(KEY_ADJECTIVES, person.getAdjectives());
        values.put(KEY_GHT_HAND, person.getGhtHand());
        values.put(KEY_GHT_ASSOCIATION, person.getGhtAssociation());
        values.put(KEY_INTER2GES, person.getInter2ges());
        values.put(KEY_PHRASES, person.getPhrases());
        values.put(KEY_TOLOOKUP, person.getTolookup());
        values.put(KEY_SKETCH, person.getSketch());
        values.put(KEY_NOTES, person.getNotes());

        // 3. insert
        db.insert(TABLE_PEOPLE, // table
                null, //nullColumnHack
                values); // key/value -> keys = column names/ values = column values

        // 4. close
        db.close();
    }

    public Person getPerson(int id){

        // 1. get reference to readable DB
        SQLiteDatabase db = this.getReadableDatabase();

        // 2. build query
        Cursor cursor =
                db.query(TABLE_PEOPLE, // a. table
                        COLUMNS, // b. column names
                        " id = ?", // c. selections
                        new String[] { String.valueOf(id) }, // d. selections args
                        null, // e. group by
                        null, // f. having
                        null, // g. order by
                        null); // h. limit

        // 3. if we got results get the first one
        if (cursor != null)
            cursor.moveToFirst();

        // 4. build book object
        Person person = new Person();
        person.setId(Integer.parseInt(cursor.getString(0)));
        person.setLocation(cursor.getString(1));
        person.setProxemics(cursor.getString(2));
        person.setDate(cursor.getString(3));
        person.setWeather(cursor.getString(4));
        person.setTemp(cursor.getString(5));
        boolean gender_val = cursor.getInt(6) > 0;
        person.setGender(gender_val);
        person.setHeight(cursor.getString(7));
        person.setWeight(cursor.getString(8));
        person.setHandedness(cursor.getInt(9));
        person.setBreathing(cursor.getInt(10));
        person.setPresence(cursor.getString(11));
        person.setPosture(cursor.getString(12));
        person.setShoes(cursor.getString(13));
        person.setColors(cursor.getString(14));
        person.setBreathrate(cursor.getString(15));
        person.setBlinkrate(cursor.getString(16));
        person.setShutterspd(cursor.getString(17));
        person.setHygiene(cursor.getString(18));
        person.setDescription(cursor.getString(19));
        person.setInitges(cursor.getString(20));
        person.setInterges(cursor.getString(21));
        boolean appreciation_val = cursor.getInt(22) > 0;
        person.setAppreciation(appreciation_val);
        boolean acceptance_val = cursor.getInt(23) > 0;
        person.setAcceptance(acceptance_val);
        boolean approval_val = cursor.getInt(24) > 0;
        person.setApproval(approval_val);
        boolean intelligence_val = cursor.getInt(25) > 0;
        person.setIntelligence(intelligence_val);
        boolean pity_val = cursor.getInt(26) > 0;
        person.setPity(pity_val);
        boolean admiration_val = cursor.getInt(27) > 0;
        person.setAdmiration(admiration_val);
        boolean power_val = cursor.getInt(28) > 0;
        person.setPower(power_val);
        person.setWeaknesses(cursor.getString(29));
        person.setDislikes(cursor.getString(30));
        person.setPronouns(cursor.getString(31));
        person.setAdjectives(cursor.getString(32));
        person.setGhtHand(cursor.getInt(33));
        person.setGhtAssociation(cursor.getInt(34));
        person.setInter2ges(cursor.getString(35));
        person.setPhrases(cursor.getString(36));
        person.setTolookup(cursor.getString(37));
        person.setSketch(cursor.getString(38));
        person.setNotes(cursor.getString(39));

        //log
        Log.d("getPerson("+id+")", person.toString());

        cursor.close();

        // 5. return book
        return person;
    }

    public List<Person> getAllPeople() {
        List<Person> people = new LinkedList<Person>();

        // 1. build the query
        String query = "SELECT  * FROM " + TABLE_PEOPLE;

        // 2. get reference to writable DB
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(query, null);

        // 3. go over each row, build book and add it to list
        Person person = null;
        if (cursor.moveToFirst()) {
            do {
                person = new Person();
                person.setId(Integer.parseInt(cursor.getString(0)));
                person.setLocation(cursor.getString(1));
                person.setProxemics(cursor.getString(2));
                person.setDate(cursor.getString(3));
                person.setWeather(cursor.getString(4));
                person.setTemp(cursor.getString(5));
                boolean gender_val = cursor.getInt(6) > 0;
                person.setGender(gender_val);
                person.setHeight(cursor.getString(7));
                person.setWeight(cursor.getString(8));
                person.setHandedness(cursor.getInt(9));
                person.setBreathing(cursor.getInt(10));
                person.setPresence(cursor.getString(11));
                person.setPosture(cursor.getString(12));
                person.setShoes(cursor.getString(13));
                person.setColors(cursor.getString(14));
                person.setBreathrate(cursor.getString(15));
                person.setBlinkrate(cursor.getString(16));
                person.setShutterspd(cursor.getString(17));
                person.setHygiene(cursor.getString(18));
                person.setDescription(cursor.getString(19));
                person.setInitges(cursor.getString(20));
                person.setInterges(cursor.getString(21));
                boolean appreciation_val = cursor.getInt(22) > 0;
                person.setAppreciation(appreciation_val);
                boolean acceptance_val = cursor.getInt(23) > 0;
                person.setAcceptance(acceptance_val);
                boolean approval_val = cursor.getInt(24) > 0;
                person.setApproval(approval_val);
                boolean intelligence_val = cursor.getInt(25) > 0;
                person.setIntelligence(intelligence_val);
                boolean pity_val = cursor.getInt(26) > 0;
                person.setPity(pity_val);
                boolean admiration_val = cursor.getInt(27) > 0;
                person.setAdmiration(admiration_val);
                boolean power_val = cursor.getInt(28) > 0;
                person.setPower(power_val);
                person.setWeaknesses(cursor.getString(29));
                person.setDislikes(cursor.getString(30));
                person.setPronouns(cursor.getString(31));
                person.setAdjectives(cursor.getString(32));
                person.setGhtHand(cursor.getInt(33));
                person.setGhtAssociation(cursor.getInt(34));
                person.setInter2ges(cursor.getString(35));
                person.setPhrases(cursor.getString(36));
                person.setTolookup(cursor.getString(37));
                person.setSketch(cursor.getString(38));
                person.setNotes(cursor.getString(39));

                // Add book to books
                people.add(person);
            } while (cursor.moveToNext());
        }

        Log.d("getAllBooks()", people.toString());

        cursor.close();

        // return books
        return people;
    }

    public int updatePerson(Person person) {

        // 1. get reference to writable DB
        SQLiteDatabase db = this.getWritableDatabase();

        // 2. create ContentValues to add key "column"/value
        ContentValues values = new ContentValues();
        values.put(KEY_LOCATION, person.getLocation()); // get title
        values.put(KEY_PROXEMICS, person.getProxemics());
        values.put(KEY_DATE, person.getDate());
        values.put(KEY_WEATHER, person.getWeather());
        values.put(KEY_TEMP, person.getTemp());
        values.put(KEY_GENDER, person.getGender());
        values.put(KEY_HEIGHT, person.getHeight());
        values.put(KEY_WEIGHT, person.getWeight());
        values.put(KEY_HANDEDNESS, person.getHandedness());
        values.put(KEY_BREATHING, person.getBreathing());
        values.put(KEY_PRESENCE, person.getPresence());
        values.put(KEY_POSTURE, person.getPosture());
        values.put(KEY_SHOES, person.getShoes());
        values.put(KEY_COLORS, person.getColors());
        values.put(KEY_BREATHRATE, person.getBreathrate());
        values.put(KEY_BLINKRATE, person.getBlinkrate());
        values.put(KEY_SHUTTERSPD, person.getShutterspd());
        values.put(KEY_HYGIENE, person.getHygiene());
        values.put(KEY_DESCRIPTION, person.getDescription());
        values.put(KEY_INITGES, person.getInitges());
        values.put(KEY_INTERGES, person.getInterges());
        values.put(KEY_APPRECIATION, person.getAppreciation());
        values.put(KEY_ACCEPTANCE, person.getAcceptance());
        values.put(KEY_APPROVAL, person.getApproval());
        values.put(KEY_INTELLIGENCE, person.getIntelligence());
        values.put(KEY_PITY, person.getPity());
        values.put(KEY_ADMIRATION, person.getAdmiration());
        values.put(KEY_POWER, person.getPower());
        values.put(KEY_WEAKNESSES, person.getWeaknesses());
        values.put(KEY_DISLIKES, person.getDislikes());
        values.put(KEY_PRONOUNS, person.getPronouns());
        values.put(KEY_ADJECTIVES, person.getAdjectives());
        values.put(KEY_GHT_HAND, person.getGhtHand());
        values.put(KEY_GHT_ASSOCIATION, person.getGhtAssociation());
        values.put(KEY_INTER2GES, person.getInter2ges());
        values.put(KEY_PHRASES, person.getPhrases());
        values.put(KEY_TOLOOKUP, person.getTolookup());
        values.put(KEY_SKETCH, person.getSketch());
        values.put(KEY_NOTES, person.getNotes());

        // 3. updating row
        int i = db.update(TABLE_PEOPLE, //table
                values, // column/value
                KEY_ID+" = ?", // selections
                new String[] { String.valueOf(person.getId()) }); //selection args

        // 4. close
        db.close();

        return i;

    }

    public void deletePerson(Person person) {

        // 1. get reference to writable DB
        SQLiteDatabase db = this.getWritableDatabase();

        // 2. delete
        db.delete(TABLE_PEOPLE, //table name
                KEY_ID+" = ?",  // selections
                new String[] { String.valueOf(person.getId()) }); //selections args

        // 3. close
        db.close();

        //log
        Log.d("deletePerson", person.toString());

    }

}