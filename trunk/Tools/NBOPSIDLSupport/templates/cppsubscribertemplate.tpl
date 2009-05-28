#ifndef __underscoredPackName__classNameSubscriber_h
#define __underscoredPackName__classNameSubscriber_h

#include "Subscriber.h"
#include "Topic.h"
#include "OPSObject.h"
#include "__className.h"


__packageDeclaration



class __classNameSubscriber : public ops::Subscriber
{

public:
    __classNameSubscriber(ops::Topic t)
        : ops::Subscriber(t)
    {

    }

    bool getData(ChildData* d)
    {
        if(!data) return false;
        aquireMessageLock();
		data->fillClone(d);
		releaseMessageLock();
        return true;
    }
/*
    __className getDataCopy()
    {
        ops::SafeLock lock(this);
        hasUnreadData = false;
        return narrowedData;
    }
*/
    __className* getTypedDataReference()
    {
        return (__className*)getDataReference();
    }

    ~__classNameSubscriber(void)
    {

    }
private:
    __className narrowedData;
protected:
    //Override
/*
    void saveCopy(ops::OPSObject* o)
    {
        ops::SafeLock lock(this);
        narrowedData = *((__className*)o);
    }
*/

};


__packageCloser

#endif