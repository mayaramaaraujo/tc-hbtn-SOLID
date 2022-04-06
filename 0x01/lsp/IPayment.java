package com.example.demo.banco;

public interface IPayment {
	void validate() throws Exception;
    void collectPayment();
}
