package com.fmse.absserver.exception;

/**
 * This class for throw forbidden access exception that will be caught by ABSServlet.
 */
public class ForbiddenAccessException extends Exception
{
    public ForbiddenAccessException() {}

    public ForbiddenAccessException(String message)
    {
        super(message);
    }
}