///////////////////////////////////////////////////////////
//  OPSObjectFactory.cs
//  Implementation of the Class OPSObjectFactory
//  Created on:      12-nov-2011 09:25:33
//  Author:
///////////////////////////////////////////////////////////

namespace Ops
{

    public class OPSSerializableFactory : ISerializableFactory
    {
        /// 
        /// <param name="typeString"></param>
        public ISerializable Create(string type)
        {
            if (type.Equals("ops.protocol.OPSMessage"))
            {
                return new OPSMessage();
            }
            if (type.Equals("DefaultOPSConfigImpl"))
            {
                return new DefaultOPSConfigImpl();
            }
            if (type.Equals("Domain"))
            {
                return new Domain();
            }
            if (type.Equals("MulticastDomain"))
            {
                return new Domain();
            }
            if (type.Equals("Topic"))
            {
                return new Topic();
            }
            return null;
        }

    }

	public class OPSObjectFactory : SerializableCompositeFactory 
    {
		internal static OPSObjectFactory instance = null;

		/// <summary>
		/// Tries to construct the most specialized version of the given typeString
		/// </summary>
		/// <param name="typeString"></param>
		public override ISerializable Create(string typeString)
        {
            string[] types = typeString.Split(' ');
            foreach (string type in types)
            {
                ISerializable serializable = base.Create(type);
                if (serializable != null)
                {
                    return serializable;
                }
            }
            return null;
		}

		/// <summary>
		/// Create singelton instance of OPSObjectFactory.
		/// </summary>
		public static OPSObjectFactory GetInstance()
        {
            if (instance == null)
            {
                instance = new OPSObjectFactory();
                instance.Add(new OPSSerializableFactory()); 
            }
            return instance;
		}

	}

}