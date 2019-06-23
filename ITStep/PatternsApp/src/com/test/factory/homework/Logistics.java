package com.test.factory.homework;

public class Logistics {

	public Transport planDelivery(String type_logistic, int code) {
		Transport transport = createTransport(type_logistic, code);
		checkTransport(transport);
		return transport;
	}

	private Transport createTransport(String type_logistic, int code) {
		if (type_logistic.trim().equalsIgnoreCase("Road logistics") && code == 0) {
			return (Transport) RoadTransport.createTransport(code);
		} else if (type_logistic.trim().equalsIgnoreCase("Sea logistics") && code == 0) {
			return (Transport) SeaTransport.createTransport(code);
		} else if (type_logistic.trim().equalsIgnoreCase("Air logistics") && code == 0) {
			return (Transport) AirTransport.createTransport(code);
		} else if (type_logistic.trim().equalsIgnoreCase("Railway logistics") && code == 0) {
			return (Transport) RailwayTransport.createTransport(code);
		}
		return null;
	}

	private void checkTransport(Transport tr) {
		if (tr != null) {
			System.out.println("Was created transport " + tr);
		} else {
			System.out.println("Transport " + tr + " is NULL");
		}
	}
}
