package misc;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddress
{
    @Test
    public void testSettersGetters()
    {
        Address addr    = new Address();
        assertNull( addr.getAddr1() );
        assertNull( addr.getAddr2() );
        assertNull( addr.getCity() );
        assertNull( addr.getState() );
        assertNull( addr.getZipCode() );
        
        String  addr1   = "1313 Mockingbird Lane";
        String  addr2   = "Apt. 13";
        String  city    = "Bronx Zoo";
        String  state   = "CA";
        String  zipCode = "12345";
        
        addr.setAddr1( addr1 );
        assertEquals( addr1, addr.getAddr1() );
        
        addr.setAddr2( addr2 );
        assertEquals( addr2, addr.getAddr2() );
        
        addr.setCity( city );
        assertEquals( city, addr.getCity() );
        
        addr.setState( state );
        assertEquals( state, addr.getState() );
        
        addr.setZipCode( zipCode );
        assertEquals( zipCode, addr.getZipCode() );
    }

    @Test
    public void testEqualsHash()
    {
        Address addressA    = new Address();
        Address addressB    = new Address();
        
        String  addr1   = "1313 Mockingbird Lane";
        String  addr2   = "Apt. 13";
        String  city    = "Bronx Zoo";
        String  state   = "CA";
        String  zipCode = "12345";
        assertEquals( addressA.hashCode(), addressB.hashCode() );
        
        assertEquals( addressA, addressB );        
        addressA.setAddr1( addr1 );
        assertNotEquals( addressA, addressB );
        addressA.setAddr1( null );
        addressB.setAddr1( addr1 );
        assertNotEquals( addressA, addressB );
        addressA.setAddr1( addr1 );        
        assertEquals( addressA, addressB );   
        assertEquals( addressA.hashCode(), addressB.hashCode() );
       
        addressA.setAddr2( addr2 );
        assertNotEquals( addressA, addressB );
        addressA.setAddr2( null );
        addressB.setAddr2( addr2 );
        assertNotEquals( addressA, addressB );
        addressA.setAddr2( addr2 );        
        assertEquals( addressA, addressB );        
        assertEquals( addressA.hashCode(), addressB.hashCode() );

        addressA.setCity( city );
        assertNotEquals( addressA, addressB );
        addressA.setCity( null );
        addressB.setCity( city );
        assertNotEquals( addressA, addressB );
        addressA.setCity( city );        
        assertEquals( addressA, addressB );        
        assertEquals( addressA.hashCode(), addressB.hashCode() );

        addressA.setState( state );
        assertNotEquals( addressA, addressB );
        addressA.setState( null );
        addressB.setState( state );
        assertNotEquals( addressA, addressB );
        addressA.setState( state );    
        assertEquals( addressA, addressB );        
        assertEquals( addressA.hashCode(), addressB.hashCode() );
        
        addressA.setZipCode( zipCode );
        assertNotEquals( addressA, addressB );
        addressA.setZipCode( null );
        addressB.setZipCode( zipCode );
        assertNotEquals( addressA, addressB );
        addressA.setZipCode( zipCode );
        assertEquals( addressA, addressB );        
        assertEquals( addressA.hashCode(), addressB.hashCode() );
        
        assertEquals( addressA, addressA );
        assertNotEquals( addressA, null );
        assertNotEquals( addressA, new Object() );
    }
}