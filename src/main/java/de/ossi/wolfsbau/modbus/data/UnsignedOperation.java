package de.ossi.wolfsbau.modbus.data;

import de.ossi.wolfsbau.modbus.data.unit.DBusUnit;

public class UnsignedOperation extends ModbusOperation {

	UnsignedOperation(int address, String description, double scaleFactor, DBusUnit dbusUnit, AccessMode mode) {
		super(address, description, scaleFactor, dbusUnit, mode);
	}

	@Override
	public Double getSkaliertenWertInWertebreich(Integer registerWert) {
		return skaliereWert(Double.valueOf(registerWert));
	}

}
