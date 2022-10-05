package com.directi.training.ocp.exercise_refactored;

public interface Resource
{
    int findSlotFree();

    void markSlotBusy(int resourceId);

    void markSlotFree(int resourceId);
}
